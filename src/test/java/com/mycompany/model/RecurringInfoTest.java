package com.mycompany.model;

import org.junit.Test;

import java.text.ParseException;

public class RecurringInfoTest {
    @Test
    public void should_return_true_when_invoice_is_due_for_today() throws ParseException {
        final RecurringInvoice recurringInvoice = RecurringInvoiceFactory.DueForToday();

    }
}
