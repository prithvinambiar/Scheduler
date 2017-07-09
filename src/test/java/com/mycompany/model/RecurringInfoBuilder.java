package com.mycompany.model;

import java.util.Date;

public class RecurringInfoBuilder {
    private Date startDate;
    private Date endDate;
    private String dayOfMonth;
    private String month;
    private String dayOfWeek;

    public RecurringInfoBuilder setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public RecurringInfoBuilder setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public RecurringInfoBuilder setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public RecurringInfoBuilder setMonth(String month) {
        this.month = month;
        return this;
    }

    public RecurringInfoBuilder setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public RecurringInfo createRecurringInfo() {
        return new RecurringInfo(startDate, endDate, dayOfMonth, month, dayOfWeek);
    }
}