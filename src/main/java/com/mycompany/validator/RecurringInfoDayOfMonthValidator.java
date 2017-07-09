package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

import java.time.LocalDate;

public class RecurringInfoDayOfMonthValidator extends AbstractRecurringInfoValidator {

    RecurringInfoDayOfMonthValidator(IRecurringInfoValidator nextPaxrser) {
        super(nextPaxrser);
    }

    @Override
    public boolean Validate(RecurringInfo recurringInfo) {
        final String dayOfMonth = String.valueOf(LocalDate.now().getDayOfMonth());
        return IsAllowAll(recurringInfo.getDayOfMonth()) || dayOfMonth.equalsIgnoreCase(recurringInfo.getDayOfMonth());
    }
}
