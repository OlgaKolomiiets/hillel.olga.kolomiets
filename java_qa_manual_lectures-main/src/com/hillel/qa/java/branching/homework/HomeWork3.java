package com.hillel.qa.java.branching.homework;

public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {

        double purchaseAmount = 300;
        String paymentMethod = "картка";

        switch (paymentMethod) {
            case  "готівка" :
                System.out.println(purchaseAmount);
                break;
            case "картка" :
                System.out.println(purchaseAmount*1.02);
                break;
            case "рахунок":
                System.out.println(purchaseAmount*1.05);
                break;
            default:
            System.out.println("Спосіб оплати не знайдено");

        }

    }
}
