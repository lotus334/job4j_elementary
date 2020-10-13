package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void mondayIsOne() {
        assertThat(
                MultipleSwitchWeek.numberOfDay("Monday"),
                is(1)
        );
    }

    @Test
    public void abrakadabraIsMinusOne() {
        assertThat(
                MultipleSwitchWeek.numberOfDay("Abrakadabra"),
                is(-1)
        );
    }
}