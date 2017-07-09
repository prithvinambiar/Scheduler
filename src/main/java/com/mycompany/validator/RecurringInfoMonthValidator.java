package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

import java.time.LocalDate;

public class RecurringInfoMonthValidator extends AbstractRecurringInfoValidator {
    RecurringInfoMonthValidator(IRecurringInfoValidator nextPaxrser) {
        super(nextPaxrser);
    }

    @Override
    public boolean Validate(RecurringInfo recurringInfo) {
        final String month = String.valueOf(LocalDate.now().getMonth().ordinal());
        return IsAllowAll(recurringInfo.getMonth()) || month.equalsIgnoreCase(recurringInfo.getMonth());
    }
}
