package com.dimidev.templatepattern.beverages;

public abstract class BeveragesWithCaffeine {
    final void prepareDrink(){
        boilWater();
        brew();
        pourInCup();
        addSupplements();
    }
    void boilWater(){ System.out.println("water is boiling."); }
    abstract void brew();
    void pourInCup(){ System.out.println("pouring in cup."); }
    void addSupplements() { }
}
