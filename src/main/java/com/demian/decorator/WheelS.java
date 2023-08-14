package com.demian.decorator;

public class WheelS extends CarDecorator {
    WheelS(Car car) {
        super(car);
        this.decorator.time0To100 = this.decorator.time0To100 - 0.6f;
    }
}
