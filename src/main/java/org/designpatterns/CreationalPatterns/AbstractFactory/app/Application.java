package org.designpatterns.CreationalPatterns.AbstractFactory.app;

import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.Button;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.CheckBox;
import org.designpatterns.CreationalPatterns.AbstractFactory.factories.GUIFactory;

/**
 * Abstract Factory defines an interface for creating all distinct products but
 * leaves the actual product creation to concrete factory classes. Each factory type
 * corresponds to a certain product variety.
 */

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
