package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Намалюйте в консолі прямокутний трикутник із зірочок
     * (або плюсиків, або будь-якого другого символу):
     * на першому рядку - одна зірочка, на другій дві, і так далі.
     * </p>
     * <br>
     * <h2>Вимоги</h2>
     * <ol style="font-size:12px">
     *     <li>Висоту та символ трикутника отримати з клавіатури</li>
     *     <li>Висота трикутника дорівнює висоті яку ми отримали з клавіатури</li>
     *     <li>Трикутник малювати символом який отримали з клавіатури</li>
     *     <li>Використовувати цикл for</li>
     * </ol>
     * <br>
     * <h2>Приклад</h2>
     * <p style="font-size:12px">
     *     Наприклад ввели з клавіатури число 4 та символ "+"
     *     <br>
     *     Вивід:
     *      <br>
     *     +
     *     <br>
     *     ++
     *      <br>
     *     +++
     *     <br>
     *     ++++
     * </p>
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть символ");
        char symbol = input.next().charAt(0);

        System.out.println("Введіть висоту:");
        int height = input.nextInt();

        for (int h = 1; h <= height; h++) {
            for (int s = 1; s <= h; s++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
