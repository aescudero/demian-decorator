package com.demian.decorator;

public class FerrariRoma extends Car {

    FerrariRoma() {
        this.time0To100 = 3.4f;
    }

    @Override
    public void move(int distance) {
        // distance = 1/2 a*t^2
        double time = Math.sqrt(2 * distance / calculateAcceleration());
        System.out.println("FerrariRoma Ran " + distance + " min " + time + " seconds");
    }
}
