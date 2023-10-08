public class Main {
    public static void main(String[] args) {
        // Начальная сумма
        int x = 300;

        // Сумма пополнения
        int x2 = 2000;

        // Минимум для начисления бонуса
        int x3 = 1000;

        // Количество бонусов
        int x4 = 0;

        // Проверка превышения порога
        if (x2 > x3) {
            // Рассчет бонуса
            int x5 = x2 - x3;
            int x6 = (int) (x5 / 100);
            x4 = x6 * 1;
        }

        // Итоговое количество бонусов
        int x7 = x + x2 + x4;

        System.out.println("Счет абонента: " + x7);
        System.out.println("Зачисленные бонусы: " + x4);
    }
}