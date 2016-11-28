package buildpatterns.prototype;

/**
 * Created by vic on 21.11.16.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coin coin = new Coin(5);
        Stanock stanock = new Stanock(coin);

        Coin firstClone = stanock.createCoin();
        Coin secondClone = stanock.createCoin();
        System.out.println("firstClone value = " + firstClone.getValue() + " " + firstClone);
        System.out.println("secondClone value = " + secondClone.getValue() + " " + secondClone);
    }
}
