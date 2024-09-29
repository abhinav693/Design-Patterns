package org.designpatterns.CreationalPatterns.Builder.builders;

import org.designpatterns.CreationalPatterns.Builder.cars.Car;
import org.designpatterns.CreationalPatterns.Builder.cars.CarType;
import org.designpatterns.CreationalPatterns.Builder.components.Engine;
import org.designpatterns.CreationalPatterns.Builder.components.GPSNavigator;
import org.designpatterns.CreationalPatterns.Builder.components.Transmission;
import org.designpatterns.CreationalPatterns.Builder.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
