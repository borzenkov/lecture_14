package buildpatterns.abstractfactory.factory;

import buildpatterns.abstractfactory.Button;
import buildpatterns.abstractfactory.Input;
import buildpatterns.abstractfactory.Label;
import buildpatterns.abstractfactory.swt.SWTButton;
import buildpatterns.abstractfactory.swt.SWTInput;
import buildpatterns.abstractfactory.swt.SWTLabel;

/**
 * Created by vic on 21.11.16.
 */
public class SWTUIFactory implements UIFactory {
    public Button createButton() {
        return new SWTButton();
    }

    public Label createLabel() {
        return new SWTLabel();
    }

    public Input createInput() {
        return new SWTInput();
    }
}
