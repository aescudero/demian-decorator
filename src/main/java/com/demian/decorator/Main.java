package com.demian.decorator;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new WheelS(new FerrariRoma());
        Car lamborghini = new HuracanSTO();
        ferrari.move(11);
        lamborghini.move(11);
    }
}
