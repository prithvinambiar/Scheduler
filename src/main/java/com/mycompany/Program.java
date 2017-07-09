package com.mycompany;

import com.mycompany.api.IApiGateway;
import com.mycompany.model.RecurringInvoice;
import com.mycompany.repository.IDatabaseRepository;
import com.mycompany.scheduler.RecurringInvoiceScheduler;
import com.mycompany.validator.RecurringInfoValidatorFactory;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        final IApiGateway apiGateway = invoice -> 0;
        final IDatabaseRepository iDatabaseRepository = () -> new ArrayList<>();
        final RecurringInvoiceScheduler recurringInvoiceScheduler = new RecurringInvoiceScheduler(apiGateway, RecurringInfoValidatorFactory.GetValidator());
        for (RecurringInvoice recurringInvoice:iDatabaseRepository.GetRecurringInvoices()) {
            recurringInvoiceScheduler.Schedule(recurringInvoice);
        }
    }
}

