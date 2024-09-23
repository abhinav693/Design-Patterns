package org.designpatterns.CreationalPatterns.FactoryMethod.factory;

import org.designpatterns.CreationalPatterns.FactoryMethod.buttons.Button;
import org.designpatterns.CreationalPatterns.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
