package com.csdisco.qa;

public class VariableWheelBicycle extends Bicycle {

    int variableTireCirc;

    public VariableWheelBicycle (int tireCircParam){
        variableTireCirc = tireCircParam;
    }

    public int getVariableTireCirc(){
        return variableTireCirc;
    }

    public void setVariableTireCirc(int tireCirc){
        variableTireCirc = tireCirc;  // is this supposed to be tireCircumference, the protected field from Bicycle?
    }

    @Override
    int getTireCircumference(){
        return variableTireCirc;
    }
}
