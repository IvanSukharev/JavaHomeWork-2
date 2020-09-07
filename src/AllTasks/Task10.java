/*Задача 10. 10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль
 */

package AllTasks;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] Array_Of_Numbers = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int Number;
        for (int i = 0; i < Array_Of_Numbers.length; i++) {
            if (Array_Of_Numbers[i] == 0) {
                for (int j = i + 1; j < Array_Of_Numbers.length; j++) {
                    if (Array_Of_Numbers[j] != 0) {
                        Number = Array_Of_Numbers[j];
                        Array_Of_Numbers[j] = Array_Of_Numbers[i];
                        Array_Of_Numbers[i] = Number;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(Array_Of_Numbers));
    }
}