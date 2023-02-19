import java.util.Arrays;

// 3. Создать квадратный двумерный целочисленный массив (количество строк и
//      * столбцов одинаковое),
//      * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
//      * только одну из диагоналей, если обе сложно).
//      * Определить элементы одной из диагоналей можно по следующему принципу: индексы
//      * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//      * 
public class task3 {
    public static void main(String[] args) {
 int[][] array_2d = new int[5][5];
 //float check =0;
        for (int i=0;i<array_2d.length;i++){
            for (int j=0;j<array_2d.length;j++){
                //check=(i+j)/2;
                if ((i+j==4)||(i==j)){
                    array_2d[i][j]=1;
                }
                else{
                    array_2d[i][j]=0;
                }
            }
        }
      System.out.println(Arrays.deepToString(array_2d));
    }
}

