package buildpatterns.abstractfactory.factory;

import buildpatterns.abstractfactory.Button;
import buildpatterns.abstractfactory.Input;
import buildpatterns.abstractfactory.Label;

/**
 * Created by vic on 21.11.16.
 */
public interface UIFactory {
    public Button createButton();
    public Label createLabel();
    public Input createInput();
}
