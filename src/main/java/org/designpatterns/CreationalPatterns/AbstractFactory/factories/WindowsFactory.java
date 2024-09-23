package org.designpatterns.CreationalPatterns.AbstractFactory.factories;

import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.Button;
import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.WindowsButton;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.CheckBox;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.WindowsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
