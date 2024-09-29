package org.designpatterns.CreationalPatterns.Builder.builders;

import org.designpatterns.CreationalPatterns.Builder.cars.CarType;
import org.designpatterns.CreationalPatterns.Builder.components.Engine;
import org.designpatterns.CreationalPatterns.Builder.components.GPSNavigator;
import org.designpatterns.CreationalPatterns.Builder.components.Transmission;
import org.designpatterns.CreationalPatterns.Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
