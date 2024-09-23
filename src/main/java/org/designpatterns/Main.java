package org.designpatterns;

import org.designpatterns.CreationalPatterns.AbstractFactory.app.Application;
import org.designpatterns.CreationalPatterns.AbstractFactory.factories.GUIFactory;
import org.designpatterns.CreationalPatterns.AbstractFactory.factories.MacFactory;
import org.designpatterns.CreationalPatterns.AbstractFactory.factories.WindowsFactory;

public class Main {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    GUIFactory factory;
    Application app;
    private static Application configureApplication() {
        GUIFactory factory;
        Application application;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}