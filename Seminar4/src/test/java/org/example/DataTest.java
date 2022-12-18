package org.example;

import static org.junit.Assert.*;

public class DataTest {
    Data date = new Data(1, 5 ,2000);

    @org.junit.Test
    public void getDay() {
        int result = date.GetDay();
        int correct = 5;
        assertEquals(5, result);
    }

    @org.junit.Test
    public void getMonthStr() {
    }

    @org.junit.Test
    public void getMonthInt() {
    }

    @org.junit.Test
    public void getYear() {
    }
    @org.junit.Test
    public void setDay() {
        date.SetDay(10);
        int result = date.GetDay();
    }

    @org.junit.Test
    public void setMonthStr() {
    }

    @org.junit.Test
    public void setMonthInt() {
    }

    @org.junit.Test
    public void setYear() {
    }

}