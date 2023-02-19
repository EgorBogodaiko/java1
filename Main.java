import javax.lang.model.util.ElementScanner14;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5));

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        String[] stringArray = { "aaa", "aab", "aa" };
        System.out.println(findCommonPrefix(stringArray)); // aa
        String[] stringArray2 = { "abc", "bca", "cda" };
        System.out.println(findCommonPrefix(stringArray2)); // ""
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 || sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true

        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue

        return null;
    }

    private static String findCommonPrefix(String[] source) {
        /**
         * Найти общий префикс
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
        String prefix = null;
        Boolean check = true;
        int i = 0;
        int array_size = source.length;
        while (check == true) {
            for (int j = 0; j < array_size-1; j++) {
                if (source[j].charAt(i) == source[j + 1].charAt(i)) {
                prefix+=source[j].charAt(i);
                }
                else{
                    check=false;
                }
                i++;
            }
        }
        return prefix;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
     * заменить 0 на 1, 1 на 0;
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
     * циклом, и числа меньшие 6 умножить на 2;
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и
     * столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     * только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы
     * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы
     * ;
     */
}