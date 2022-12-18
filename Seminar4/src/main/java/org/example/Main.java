package org.example;

public class Main {
    public static void main(String[] args) {
    try
    {
        Data date = new Data(5, 5, 2007);
        System.out.println(date.GetDay() +"."+ date.GetMonthInt()+"."+date.GetYear());
    }catch (IllegalArgumentException e)
    {
        System.err.println("Неверные входные данные конструктора");
    }

}


}