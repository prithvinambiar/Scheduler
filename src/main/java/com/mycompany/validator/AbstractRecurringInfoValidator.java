package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

public abstract class AbstractRecurringInfoValidator implements IRecurringInfoValidator {
    public static final String ALLOW_ALL_STRING = "*";
    private final IRecurringInfoValidator nextPaxrser;

    public AbstractRecurringInfoValidator(IRecurringInfoValidator nextPaxrser) {
        this.nextPaxrser = nextPaxrser;
    }

    public boolean IsScheduledForNow(RecurringInfo recurringInfo){
        return Validate(recurringInfo) && nextPaxrser.IsScheduledForNow(recurringInfo);
    }

    public boolean IsAllowAll(String str){
        return str.equalsIgnoreCase(ALLOW_ALL_STRING);
    }

    public abstract boolean Validate(RecurringInfo recurringInfo);
}

