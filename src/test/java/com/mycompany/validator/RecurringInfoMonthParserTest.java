package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;
import com.mycompany.model.RecurringInfoBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class RecurringInfoMonthParserTest {
    @Test
    public void should_return_true_if_recurring_info_month_is_current_month(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setMonth(String.valueOf(LocalDate.now().getMonth().ordinal()));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoMonthValidator recurringInfoMonthParser = new RecurringInfoMonthValidator(new StopChainValidator());

        Assert.assertTrue(recurringInfoMonthParser.IsScheduledForNow(recurringInfo));
    }

    @Test
    public void should_return_true_if_recurring_info_month_is_not_current_month(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setMonth(String.valueOf(LocalDate.now().getMonth().ordinal() + 1));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoMonthValidator recurringInfoMonthParser = new RecurringInfoMonthValidator(new StopChainValidator());

        Assert.assertFalse(recurringInfoMonthParser.IsScheduledForNow(recurringInfo));
    }
}
