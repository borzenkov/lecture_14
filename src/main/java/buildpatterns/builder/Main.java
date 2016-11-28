package buildpatterns.builder;

/**
 * Created by vic on 21.11.16.
 */
public class Main {

    public static void main(String[] args) {
        /*ComputerManager computerManager = new ComputerManager(new IntelComputerBuilder());
        System.out.println(computerManager.buildComputer());*/

        Computer.Builder builder = new Computer.Builder();
        builder.withMotherBoard("Intel").withCPU("Intel").withHDD("Intel").withRAM("Intel");
        System.out.println(new Computer(builder));
    }
}
