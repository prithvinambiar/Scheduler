package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;
import com.mycompany.model.RecurringInfoBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class RecurringInfoDayOfWeekParserTest {
    @Test
    public void should_return_true_if_day_of_week_is_today(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setDayOfWeek(String.valueOf(LocalDate.now().getDayOfWeek().ordinal()));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoDayOfWeekValidator recurringInfoDayOfMonthParser = new RecurringInfoDayOfWeekValidator(new StopChainValidator());

        Assert.assertTrue(recurringInfoDayOfMonthParser.IsScheduledForNow(recurringInfo));
    }

    @Test
    public void should_return_false_if_day_of_week_is_not_today(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setDayOfWeek(String.valueOf(LocalDate.now().plusDays(1).getDayOfWeek().ordinal()));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoDayOfWeekValidator recurringInfoDayOfMonthParser = new RecurringInfoDayOfWeekValidator(new StopChainValidator());

        Assert.assertFalse(recurringInfoDayOfMonthParser.IsScheduledForNow(recurringInfo));
    }
}
