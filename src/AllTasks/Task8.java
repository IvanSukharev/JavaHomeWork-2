/*Задача 8. Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
        - максимальное значение
        - сумму положительных элементов
        - сумму четных отрицательных элементов
        - количество положительных элементов
        - среднее арифметическое отрицательных элементов
 */

package AllTasks;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        int Array_Of_Numbers[] = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int Summ_Of_Positive_Numbers = 0;
        int Summ_Of_Negative_Numbers = 0;
        int Summ_Of_Even_Negative_Numbers = 0;
        int Amount_Of_Positive_Numbers_In_Array = 0;
        int Amount_Of_Negative_Numbers_In_Array = 0;

        Arrays.sort(Array_Of_Numbers);

        for (int i = 0; i < Array_Of_Numbers.length; i++)
        {
            if (Array_Of_Numbers[i] > 0)
            {
                Summ_Of_Positive_Numbers = Summ_Of_Positive_Numbers + Array_Of_Numbers[i];
                Amount_Of_Positive_Numbers_In_Array++;

            }

            else if (Array_Of_Numbers[i] < 0)
            {
                Summ_Of_Negative_Numbers = Summ_Of_Negative_Numbers + Array_Of_Numbers[i];
                Amount_Of_Negative_Numbers_In_Array++;
            }

        }

        for (int i = 0; i < Array_Of_Numbers.length; i++)
        {
            if (Array_Of_Numbers[i] < 0 && Array_Of_Numbers[i] % 2 == 0)
            {
                Summ_Of_Even_Negative_Numbers = Summ_Of_Even_Negative_Numbers + Array_Of_Numbers[i];
            }
        }

        System.out.println("Наибольшее Число В Массиве: " + Array_Of_Numbers[Array_Of_Numbers.length -1]);
        System.out.println("Сумма Положительных Чисел В Массиве: " + Summ_Of_Positive_Numbers);
        System.out.println("Сумма Четных Отрицательных Чисел В Массиве: " + Summ_Of_Even_Negative_Numbers);
        System.out.println("Количество Положительных Чисел В Массиве: " + Amount_Of_Positive_Numbers_In_Array);
        System.out.println("Среднее Арифметическое Отрицательных Чисел В Массиве: " + Summ_Of_Negative_Numbers / Amount_Of_Negative_Numbers_In_Array);
    }
}
