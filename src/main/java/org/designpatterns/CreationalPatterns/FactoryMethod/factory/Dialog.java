package org.designpatterns.CreationalPatterns.FactoryMethod.factory;

import org.designpatterns.CreationalPatterns.FactoryMethod.buttons.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}
