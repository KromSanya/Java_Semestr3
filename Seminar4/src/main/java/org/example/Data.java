package org.example;

public class Data {
    private int day, years, month;
    private String month2;
    private enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
    private String[] arr = new String[] {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
    public Data()
    {
        day = 1;
        years = 1973;
        month2 = "january";
    }

    public Data(int d, String m, int y)
    {
        int i = -1;
        if (d <= 0 || d > 31 || y <= 0)
        {
            throw new IllegalArgumentException("Неверные входные данные");
        }
        years = y;
        for ( i = 0; i < arr.length; i++) {
            arr[i].toLowerCase();
            if(arr[i] == m)
            {
                month = i+1;
            }
        }
        if(i == -1) throw new IllegalArgumentException("Неверные входные данные");
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            day = d;
        } else if (month == 2 && y % 4 !=0)
        {
            if(d > 28) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        } else if (month == 2 && y % 4 == 0) {
            if(d > 29) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        } else
        {
            if(d == 31) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        }
        month2 = arr[month-1];
    }
    public Data(int d, int m, int y)
    {

        if (d <= 0 || d > 31 || m <= 0 || m > 12 || y <= 0)
        {
            throw new IllegalArgumentException("Неверные входные данные");
        }
        years = y;
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m ==12)
        {
            day = d;
        } else if (m == 2 && y % 4 !=0)
        {
            if(d > 28) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        } else if (m == 2 && y % 4 == 0) {
            if(d > 29) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        } else
        {
            if(d == 31) throw new IllegalArgumentException("Неверные входные данные");
            else day = d;
        }
        month2 = arr[m-1];
    }

    public void SetDay(int day)
    {
        this.day = day;
    }
    public void SetMonthStr(String month)
    {
        month2 = month;
    }
    public void SetMonthInt(int month)
    {
        month2 = arr[month];
    }
    public void SetYear(int year)
    {
        this.years = year;
    }
    public int GetDay()
    {
        return day;
    }
    public String GetMonthStr()
    {
        return month2;
    }
    public int GetMonthInt()
    {
        return month;
    }
    public int GetYear()
    {
        return years;
    }
}
