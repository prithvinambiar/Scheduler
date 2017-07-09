package com.mycompany.validator;

public class RecurringInfoValidatorFactory {
    public static IRecurringInfoValidator GetValidator(){
        final RecurringInfoIntervalValidator recurringInfoIntervalValidator = new RecurringInfoIntervalValidator(new StopChainValidator());
        final RecurringInfoMonthValidator recurringInfoMonthValidator = new RecurringInfoMonthValidator(recurringInfoIntervalValidator);
        final RecurringInfoDayOfMonthValidator recurringInfoDayOfMonthValidator = new RecurringInfoDayOfMonthValidator(recurringInfoMonthValidator);
        final RecurringInfoDayOfWeekValidator recurringInfoDayOfWeekValidator = new RecurringInfoDayOfWeekValidator(recurringInfoDayOfMonthValidator);
        return recurringInfoDayOfWeekValidator;
    }
}
