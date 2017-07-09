package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

import java.time.LocalDate;

public class RecurringInfoDayOfWeekValidator extends AbstractRecurringInfoValidator {
    RecurringInfoDayOfWeekValidator(IRecurringInfoValidator nextPaxrser) {
        super(nextPaxrser);
    }

    @Override
    public boolean Validate(RecurringInfo recurringInfo) {
        final String dayOfWeek = String.valueOf(LocalDate.now().getDayOfWeek().ordinal());
        return IsAllowAll(recurringInfo.getDayOfWeek()) || dayOfWeek.equalsIgnoreCase(recurringInfo.getDayOfWeek());
    }
}
