package com.mycompany.model;

import java.util.List;

public class RecurringInvoice extends Invoice{
    public final RecurringInfo recurringInfo;

    public RecurringInvoice(String invoiceName, List<LineItem> lineItems, RecurringInfo recurringInfo) {
        super(invoiceName, lineItems);
        this.recurringInfo = recurringInfo;
    }
}
