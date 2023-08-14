package com.demian.decorator;

public abstract class Car {

    protected float time0To100 = 0f; // Time to get from 0 to 100km/h in seconds

    abstract void move(int distance);

    double calculateAcceleration() {
        // v1 = v0 + a t
        double meterPerSecond = 1000 / 3600d;
        return 100 * meterPerSecond / time0To100;
    }

}
