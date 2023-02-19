import java.util.Arrays;
public class task2 {
    
    // * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
    //  * циклом, и числа меньшие 6 умножить на 2;
    public static void main(String[] args) {
        int[] my_array={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         for (int i=0;i<my_array.length;i++){
            if (my_array[i]<6){
                my_array[i]*=2;
            }
         }
         System.out.println(Arrays.toString(my_array));
    }
}
