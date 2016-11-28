package buildpatterns.factorymethod.factory;

import buildpatterns.factorymethod.Train;
import buildpatterns.factorymethod.Transport;

/**
 * Created by vic on 21.11.16.
 */
public class TrainFactory implements TransportFactory {
    public Transport factoryMethod() {
        return new Train();
    }
}
