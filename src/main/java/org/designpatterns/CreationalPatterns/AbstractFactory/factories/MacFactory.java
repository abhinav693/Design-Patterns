package org.designpatterns.CreationalPatterns.AbstractFactory.factories;

import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.Button;
import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.MacButton;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.CheckBox;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.MacCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
