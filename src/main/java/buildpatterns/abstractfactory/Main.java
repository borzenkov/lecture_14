package buildpatterns.abstractfactory;

import buildpatterns.abstractfactory.factory.SWTUIFactory;
import buildpatterns.abstractfactory.factory.UIFactory;

/**
 * Created by vic on 21.11.16.
 */
public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = new SWTUIFactory();
        Button button = uiFactory.createButton();
        Label label = uiFactory.createLabel();
        Input input = uiFactory.createInput();
        button.show();
        label.show();
        input.show();
    }
}
