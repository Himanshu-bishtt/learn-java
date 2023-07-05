package com.company;

public class BMW extends Car{
    private int freeServiceTerm;

    public BMW(int freeServiceTerm){
        super("BMW","MD3",4,5,6,false);
        this.freeServiceTerm = freeServiceTerm;
    }

    public void accelerate(int rate, int direction) {
//        int newVelocity = getCurrentVelocity() + rate;

        if(rate < 0) {
            // means car is stopped
            stop();
            changeGear(1);
        } else if(rate > 10 && rate <= 20) {
            changeGear(2);
        } else if(rate > 20 && rate <= 30) {
            changeGear(3);
        } else if(rate > 30 && rate <= 40) {
            changeGear(4);
        } else if(rate > 40 && rate <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(rate > 0) {
            changeSpeed(rate, direction );
        }
    }
}
