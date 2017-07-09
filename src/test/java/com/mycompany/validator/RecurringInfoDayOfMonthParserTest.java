package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;
import com.mycompany.model.RecurringInfoBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class RecurringInfoDayOfMonthParserTest {
    @Test
    public void should_return_true_if_day_of_month_is_today(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setDayOfMonth(String.valueOf(LocalDate.now().getDayOfMonth()));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoDayOfMonthValidator recurringInfoDayOfMonthParser = new RecurringInfoDayOfMonthValidator(new StopChainValidator());

        Assert.assertTrue(recurringInfoDayOfMonthParser.Validate(recurringInfo));
    }

    @Test
    public void should_return_false_if_day_of_month_is_not_today(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setDayOfMonth(String.valueOf(LocalDate.now().plusDays(1).getDayOfMonth()));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoDayOfMonthValidator recurringInfoDayOfMonthParser = new RecurringInfoDayOfMonthValidator(new StopChainValidator());

        Assert.assertFalse(recurringInfoDayOfMonthParser.Validate(recurringInfo));
    }
}
