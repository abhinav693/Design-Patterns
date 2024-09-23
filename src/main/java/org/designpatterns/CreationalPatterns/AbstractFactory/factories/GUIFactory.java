package org.designpatterns.CreationalPatterns.AbstractFactory.factories;

import org.designpatterns.CreationalPatterns.AbstractFactory.buttons.Button;
import org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {

    Button createButton();
    CheckBox createCheckbox();

}
