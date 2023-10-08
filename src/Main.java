public class Main {
    public static void main(String[] args) {
        // Начальная сумма
        int balance = 300;

        // Сумма пополнения
        int refill = 2000;

        // Минимум для начисления бонуса
        int minThreshold = 1000;

        // Количество бонусов
        int bonus = 0;

        // Проверка превышения порога
        if (refill > minThreshold) {
            // Рассчет бонуса
            int calcBonus = refill - minThreshold;
            int totalBonus = (int) (calcBonus / 100);
            bonus = totalBonus * 1;
        }

        // Итоговое количество бонусов
        int x7 = balance + refill + bonus;

        System.out.println("Счет абонента: " + x7);
        System.out.println("Зачисленные бонусы: " + bonus);
    }
}