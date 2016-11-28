package buildpatterns.prototype;

/**
 * Created by vic on 21.11.16.
 */
public class Stanock {
    private Coin prototype;

    public Stanock(Coin prototype) {
        this.prototype = prototype;
    }

    public Coin createCoin() throws CloneNotSupportedException {
        return (Coin) this.prototype.clone();
    }
}
