package org.designpatterns.CreationalPatterns.AbstractFactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a Mac variant of a button.
 */
public class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created a MacOS Button");
    }
}
