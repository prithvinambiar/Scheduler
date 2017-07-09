package com.mycompany.model;

import java.util.Date;

public class RecurringInfo {
    private final Date startDate;
    private final Date endDate;
    private final String dayOfMonth;
    private final String month;
    private final String dayOfWeek;

    public RecurringInfo(Date startDate, Date endDate, String dayOfMonth, String month, String dayOfWeek) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getMonth() {
        return month;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
