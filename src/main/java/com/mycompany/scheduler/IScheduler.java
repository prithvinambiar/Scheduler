package com.mycompany.scheduler;

import com.mycompany.model.RecurringInvoice;

public interface IScheduler {
    void Schedule(RecurringInvoice recurringInvoice);
}
