
// * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//      * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
//      * заменить 0 на 1, 1 на 0;
import java.util.Arrays;
public class task1 {

    public static void main(String[] args) {
        int[] input_array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < input_array.length; i++) {
            if (input_array[i] == 1) {
                input_array[i] = 0;
            } else {
                input_array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(input_array));
    }
}
