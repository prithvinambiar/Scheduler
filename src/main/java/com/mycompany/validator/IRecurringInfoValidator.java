package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

public interface IRecurringInfoValidator {
    boolean IsScheduledForNow(RecurringInfo recurringInfo);
}

