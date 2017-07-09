package com.mycompany.repository;

import com.mycompany.model.RecurringInvoice;

import java.util.List;

public interface IDatabaseRepository{
    List<RecurringInvoice> GetRecurringInvoices();
}
