package com.demian.decorator;

public abstract class CarDecorator extends Car {
    protected Car decorator;

    CarDecorator(Car car) {
        this.decorator = car;
    }

    @Override
    public void move(int distance) {
        decorator.move(distance);
    }
}
