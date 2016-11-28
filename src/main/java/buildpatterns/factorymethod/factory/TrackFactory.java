package buildpatterns.factorymethod.factory;

import buildpatterns.factorymethod.Track;
import buildpatterns.factorymethod.Transport;

/**
 * Created by vic on 21.11.16.
 */
public class TrackFactory implements TransportFactory{
    public Transport factoryMethod() {
        return new Track();
    }
}
