package com.mycompany.scheduler;

import com.mycompany.api.IApiGateway;
import com.mycompany.model.RecurringInvoice;
import com.mycompany.model.RecurringInvoiceFactory;
import com.mycompany.validator.RecurringInfoValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.text.ParseException;

@RunWith(MockitoJUnitRunner.class)
public class RecurringInvoiceSchedulerTest {
    @Mock
    private IApiGateway apiGateway;

    private IScheduler scheduler;

    @Before
    public void setUp() {
        scheduler = new RecurringInvoiceScheduler(apiGateway, RecurringInfoValidatorFactory.GetValidator());
    }

    @Test
    public void should_create_invoice_for_daily_invoice() throws ParseException {
        final RecurringInvoice recurringInvoice = RecurringInvoiceFactory.DueForToday();

        scheduler.Schedule(recurringInvoice);

        Mockito.verify(apiGateway).CreateInvoice(recurringInvoice);
    }

    @Test
    public void should_not_create_invoice_when_invoice_is_not_scheduled_for_today() throws ParseException {
        final RecurringInvoice recurringInvoice = RecurringInvoiceFactory.DueForTomorrow();

        scheduler.Schedule(recurringInvoice);

        Mockito.verify(apiGateway, Mockito.never()).CreateInvoice(recurringInvoice);
    }
}
