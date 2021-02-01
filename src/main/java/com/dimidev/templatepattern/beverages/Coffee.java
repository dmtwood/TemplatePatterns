package com.dimidev.templatepattern.beverages;

public class Coffee extends BeveragesWithCaffeine{
    @Override
    void brew() {System.out.println("Using boiling water to brew coffee."); }
    void addSupplements() { System.out.println("Adding milk and sugar to coffee."); }
}
