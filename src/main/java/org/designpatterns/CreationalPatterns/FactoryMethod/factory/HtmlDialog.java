package org.designpatterns.CreationalPatterns.FactoryMethod.factory;

import org.designpatterns.CreationalPatterns.FactoryMethod.buttons.Button;
import org.designpatterns.CreationalPatterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
