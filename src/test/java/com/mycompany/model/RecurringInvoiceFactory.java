package com.mycompany.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecurringInvoiceFactory {
    public static RecurringInvoice DueForToday() throws ParseException {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        final Date startDate = simpleDateFormat.parse("07/08/2017");
        final Date endDate = simpleDateFormat.parse("07/08/2018");
        final RecurringInfo recurringInfo = new RecurringInfoBuilder().setStartDate(startDate).setEndDate(endDate).setDayOfMonth("*").setMonth("*").setDayOfWeek("*").createRecurringInfo();
        final LineItem lineItem = new LineItem("LineItemName", 1, 10.0);
        final List<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(lineItem);
        }};
        return new RecurringInvoice("InvoiceName", lineItems, recurringInfo);
    }

    public static RecurringInvoice DueForTomorrow() throws ParseException {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        final Date startDate = simpleDateFormat.parse("07/08/2017");
        final Date endDate = simpleDateFormat.parse("07/08/2018");
        final String dayOfWeek = String.valueOf(LocalDate.now().getDayOfWeek().plus(1).ordinal());
        final RecurringInfo recurringInfo = new RecurringInfoBuilder().setStartDate(startDate).setEndDate(endDate).setDayOfMonth("*").setMonth("*").setDayOfWeek(dayOfWeek).createRecurringInfo();
        final LineItem lineItem = new LineItem("LineItemName", 1, 10.0);
        final List<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(lineItem);
        }};
        return new RecurringInvoice("InvoiceName", lineItems, recurringInfo);

    }
}
