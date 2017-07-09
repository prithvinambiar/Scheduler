package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

import java.sql.Date;
import java.time.LocalDate;

public class RecurringInfoIntervalValidator extends AbstractRecurringInfoValidator {
    RecurringInfoIntervalValidator(IRecurringInfoValidator nextPaxrser) {
        super(nextPaxrser);
    }

    @Override
    public boolean Validate(RecurringInfo recurringInfo) {
        final Date currentDate = Date.valueOf(LocalDate.now());
        return recurringInfo.getStartDate().before(currentDate) && recurringInfo.getEndDate().after(currentDate);
    }
}
