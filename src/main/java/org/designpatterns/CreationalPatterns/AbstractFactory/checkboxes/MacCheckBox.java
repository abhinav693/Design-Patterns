package org.designpatterns.CreationalPatterns.AbstractFactory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Created a Mac Checkbox");
    }
}
