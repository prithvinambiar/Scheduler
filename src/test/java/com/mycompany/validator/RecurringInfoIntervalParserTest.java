package com.mycompany.validator;

import com.mycompany.model.RecurringInfo;
import com.mycompany.model.RecurringInfoBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

public class RecurringInfoIntervalParserTest {
    @Test
    public void should_return_true_if_current_date_falls_within_start_date_and_end_date(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setStartDate(Date.valueOf(LocalDate.now().minusDays(1)));
        recurringInfoBuilder.setEndDate(Date.valueOf(LocalDate.now().plusDays(1)));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoIntervalValidator recurringInfoIntervalParser = new RecurringInfoIntervalValidator(new StopChainValidator());

        Assert.assertTrue(recurringInfoIntervalParser.IsScheduledForNow(recurringInfo));
    }

    @Test
    public void should_return_false_if_current_date_does_not_fall_within_start_date_and_end_date(){
        final RecurringInfoBuilder recurringInfoBuilder = new RecurringInfoBuilder();
        recurringInfoBuilder.setStartDate(Date.valueOf(LocalDate.now().minusDays(2)));
        recurringInfoBuilder.setEndDate(Date.valueOf(LocalDate.now().minusDays(1)));
        final RecurringInfo recurringInfo = recurringInfoBuilder.createRecurringInfo();

        final RecurringInfoIntervalValidator recurringInfoIntervalParser = new RecurringInfoIntervalValidator(new StopChainValidator());

        Assert.assertFalse(recurringInfoIntervalParser.IsScheduledForNow(recurringInfo));
    }
}