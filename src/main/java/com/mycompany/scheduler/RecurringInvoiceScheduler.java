package com.mycompany.scheduler;

import com.mycompany.api.IApiGateway;
import com.mycompany.model.RecurringInvoice;
import com.mycompany.validator.IRecurringInfoValidator;

public class RecurringInvoiceScheduler implements IScheduler{
    private final IApiGateway apiGateway;
    private final IRecurringInfoValidator recurringInfoValidator;

    public RecurringInvoiceScheduler(IApiGateway apiGateway, IRecurringInfoValidator recurringInfoValidator) {
        this.apiGateway = apiGateway;
        this.recurringInfoValidator = recurringInfoValidator;
    }

    public void Schedule(RecurringInvoice recurringInvoice) {
        if(recurringInfoValidator.IsScheduledForNow(recurringInvoice.recurringInfo)) {
            apiGateway.CreateInvoice(recurringInvoice);
        }
    }
}
