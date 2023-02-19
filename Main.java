import  java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5));

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        String[] stringArray = { "aaa", "aab", "aa" };
        System.out.println(findCommonPrefix(stringArray)); // aa
        String[] stringArray2 = { "abc", "bca", "cda" };
        System.out.println(findCommonPrefix(stringArray2)); // ""
        System.out.println(isLeapYear(1700));// false
        System.out.println(isLeapYear(2020));// true
        System.out.println(Arrays.toString(createArray(5,9))); //[9, 9, 9, 9, 9]
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
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
            System.out.print(source);
            
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array_out = new int[len];
        for (int i = 0; i < len; i++) {
            array_out[i] = initalValue;
        }
        return array_out;
    }

    private static String findCommonPrefix(String[] source) {
        /**
         * Найти общий префикс
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
        String prefix = "";
        Boolean check = true;
        int i = 0;
        int array_size = source.length;
        while (check == true) {
            for (int j = 0; j < array_size - 1; j++) {
                try {
                    check = source[j].charAt(i) == source[j + 1].charAt(i);
                } catch (Exception e) {
                    check = false;
                    return prefix;
                }
            }
            if (check == true) {
                prefix += source[0].charAt(i);
            }
            i++;
        }
        return prefix;
    }
}