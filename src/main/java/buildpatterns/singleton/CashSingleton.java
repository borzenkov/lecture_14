package buildpatterns.singleton;

/**
 * Created by vic on 21.11.16.
 */
public class CashSingleton {

    public static CashSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private CashSingleton() {}

    private static class InstanceHolder {
        private static final CashSingleton INSTANCE = new CashSingleton();
    }
}
