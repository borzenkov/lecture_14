package buildpatterns.prototype;

/**
 * Created by vic on 21.11.16.
 */
public class Coin implements Cloneable{
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
