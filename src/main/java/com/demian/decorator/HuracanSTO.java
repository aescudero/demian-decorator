package com.demian.decorator;

public class HuracanSTO extends Car {

    HuracanSTO() {
        this.time0To100 = 3.0f;
    }

    @Override
    public void move(int distance) {
        // distance = 1/2 a*t^2
        double time = Math.sqrt(2 * distance / calculateAcceleration());
        System.out.println("HuracanSTO Ran " + distance + " m in " + time + " seconds");
    }
}
