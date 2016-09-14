package com.csdisco.qa;

class Bicycle {

    int cadence = 0;
    int gear = 1;
    float speed = 0;

    void changeCadence(int newValue) {      //changecadence = 50
        if (newValue < 0) {
            cadence = 0;
        }
        else if (newValue > 100){
            cadence = 100;
        }

        else {
            cadence = newValue;
        }

        updateSpeed();
    }

    void changeGear(int newValue) {

        if (newValue < 1){
            gear = 1;
        }

        else if (newValue > 6){
            gear = 6;
        }

        else {
            gear = newValue;
        }

        updateSpeed();
    }

    void updateSpeed (){

        int inchesPerMin;
        float milesPerHour;
        int tireCircumference = 80;
        int tireRPM = 0;
        int inchesPerMile = 63360; // there are 63360 inches in a mile
        int minutesPerHour = 60;

        tireRPM = gear * cadence;
        inchesPerMin = tireRPM * tireCircumference;
        milesPerHour = (float) inchesPerMin / inchesPerMile * minutesPerHour;
        speed = milesPerHour;
    }

    void speedUp(int increment) { cadence = cadence + increment; }

    void applyBrakes(int decrement) {cadence = cadence - decrement; }

    void printStates() {
         System.out.println("cadence:" + cadence
                 + " speed:" + speed
                 + " gear:" + gear);
    }
}