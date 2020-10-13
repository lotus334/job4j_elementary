package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {

    @Test
    public void day1IsMonday() {
        assertThat(
                SwitchWeek.nameOfDay(1),
                is("Понедельник")
        );
    }

    @Test
    public void day20IsError() {
        assertThat(
                SwitchWeek.nameOfDay(20),
                is("Ошибка")
        );
    }
}