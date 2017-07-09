package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;

public class StopChainValidator implements IRecurringInfoValidator{

    @Override
    public boolean IsScheduledForNow(RecurringInfo recurringInfo) {
        return true;
    }
}
