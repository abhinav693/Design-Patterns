package org.designpatterns.CreationalPatterns.AbstractFactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a Windows variant of a button.
 */
public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created a Windows Button");
    }
}
