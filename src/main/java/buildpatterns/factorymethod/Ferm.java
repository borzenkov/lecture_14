package buildpatterns.factorymethod;

import buildpatterns.factorymethod.factory.TrackFactory;
import buildpatterns.factorymethod.factory.TransportFactory;

/**
 * Created by vic on 21.11.16.
 */
public class Ferm {

    private TransportFactory transportFactory;

    public  Ferm(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public TransportFactory getTransportFactory() {
        return transportFactory;
    }

    public void setTransportFactory(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public static void main(String[] args) {
        Ferm ferm = new Ferm(new TrackFactory());
        ferm.start();
    }

    public void start() {
        //создаем продукт
        Object cargo = createProduct();
        //транспортируем
        this.transportFactory.factoryMethod().transport(cargo);
    }

    private Object createProduct() {
        //Генерируем какие-то полезные действия
        return new Object();
    }
}
