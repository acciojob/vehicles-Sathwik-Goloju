package com.driver;

public class F1 extends Car {
    Vehicle vehicle=new Vehicle("Game");
    public F1(String name, boolean isManual) {
       super(name,1,1,1,isManual,"Testing",1);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = vehicle.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed ==0) {
            this.stop();
            this.changeGear(1);
            //Stop the car, set gear as 1
        }else if(newSpeed>=1 && newSpeed<=50){
            this.changeGear(1);
        } else if (newSpeed>=51 && newSpeed<=100) {
            this.changeGear(2);
        } else if (newSpeed>=101 && newSpeed<=150) {
            this.changeGear(3);
        }else if (newSpeed>=151 && newSpeed<=200) {
            this.changeGear(4);
        }else if (newSpeed>=201 && newSpeed<=250) {
            this.changeGear(5);
        }else if (newSpeed>=251) {
            this.changeGear(6);
        }
        else{
            this.changeGear(0);
        }

        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    private int getCurrentDirection() {
        return 0;
    }
}
