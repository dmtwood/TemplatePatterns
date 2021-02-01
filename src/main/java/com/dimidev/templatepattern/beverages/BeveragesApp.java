package com.dimidev.templatepattern.beverages;

public class BeveragesApp {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("\nMaking a cup of coffee...");
        coffee.prepareDrink();

        Tea tea = new Tea();
        System.out.println("\nMaking a cup of tea...");
        tea.prepareDrink();
    }
}
