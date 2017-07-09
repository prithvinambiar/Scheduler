package com.mycompany.model;

public class LineItem {
    private final String name;
    private final int quantity;
    private final double perUnitAmount;

    public LineItem(String name, int quantity, double perUnitAmount) {
        this.name = name;
        this.quantity = quantity;
        this.perUnitAmount = perUnitAmount;
    }
}
