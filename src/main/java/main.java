public class main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
    }

    public static void task0() {
        int a = 5;
        int b = 2;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;

        System.out.println("Задание 0. Арифметические операции с int:");
        System.out.println("сложение: " + sum);
        System.out.println("вычитание: " + diff);
        System.out.println("умножение: " + prod);
        System.out.println("деление: " + quot);
        System.out.println();
    }

    public static void task1() {
        int x = 5;
        double y = 2.5;

        double result = x * y + x / y - y;

        System.out.println("Задание 1. Арифметические операции с int и double:");
        System.out.println("Результат: " + result);
        System.out.println();
    }

    public static void task2() {
        int a = 4;
        int b = 7;

        boolean isLess = a < b;
        boolean isGreater = a > b;
        boolean isLessOrEqual = a <= b;
        boolean isGreaterOrEqual = a >= b;

        System.out.println("Задание 2. Логические операции:");
        System.out.println("a < b: " + isLess);
        System.out.println("a > b: " + isGreater);
        System.out.println("a <= b: " + isLessOrEqual);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3. Диапазоны типов данных:");
        System.out.println("Минимальное значение float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);
        System.out.println("Минимальное значение double: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);
        System.out.println();
    }

    public static void task4() {
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 1;

        System.out.println("Задание 4. Переполнение int:");
        System.out.println("Максимальное значение int: " + maxInt);
        System.out.println("Результат переполнения: " + overflow);
    }

}