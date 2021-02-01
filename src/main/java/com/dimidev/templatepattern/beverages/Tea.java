package com.dimidev.templatepattern.beverages;

public class Tea extends BeveragesWithCaffeine {

    @Override
    void brew() {
        System.out.println("Steeping the tea in boiling water.");
    }

    void addSupplements(){
        System.out.println("Adding a slice of lemon to the cup of tea.");
    }
}
