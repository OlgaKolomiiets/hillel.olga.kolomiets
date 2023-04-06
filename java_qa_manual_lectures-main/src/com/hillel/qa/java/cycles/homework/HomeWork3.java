package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
       int sum = 0;
       int digit = 0;
       int count = 0;

       while (count < 100) {
           count++;
           digit++;

           if (digit % 3 == 0) {
               continue;
           }
           sum += digit;
       }
       System.out.println(sum);

    }
}
