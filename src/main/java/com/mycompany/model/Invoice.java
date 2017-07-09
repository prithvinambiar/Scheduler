package com.mycompany.model;

import java.util.List;

public class Invoice {
    private final String invoiceName;
    private final List<LineItem> lineItems;

    public Invoice(String invoiceName, List<LineItem> lineItems){

        this.invoiceName = invoiceName;
        this.lineItems = lineItems;
    }
}
