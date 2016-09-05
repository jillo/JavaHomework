package com.csdisco.qa;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle(80);
        Bicycle bike2 = new VariableWheelBicycle(50);

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(7);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(20);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(4);
        bike2.printStates();
    }
}

