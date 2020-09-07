/*Задача 9. Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
Переставить элементы массива в обратном порядке. Вывести результат в консоль
 */

package AllTasks;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int Array_Of_Numbers[] = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        for(int i = 0; i < Array_Of_Numbers.length / 2; i++)
        {
            int Number_In_Array = Array_Of_Numbers[i];
            Array_Of_Numbers[i] = Array_Of_Numbers[Array_Of_Numbers.length - i - 1];
            Array_Of_Numbers[Array_Of_Numbers.length - i - 1] = Number_In_Array;
        }
        System.out.println(Arrays.toString(Array_Of_Numbers));
    }
}