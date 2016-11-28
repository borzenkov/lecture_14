package buildpatterns.factorymethod;

/**
 * Created by vic on 21.11.16.
 */
public class Train implements Transport {
    public void transport(Object cargo) {
        System.out.println("This is the train!");
    }
}
