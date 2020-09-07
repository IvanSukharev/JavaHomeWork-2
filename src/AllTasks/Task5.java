//Задача 5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.

package AllTasks;

import java.util.Scanner;
import java.util.Arrays;

class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] InputNumbers = new int[3];

        String WordsForOutput[] = {"Первое", "Второе", "Третье"};

        for (int i = 0; i < 3; i++){
            System.out.print("Введите " + WordsForOutput[i] + " Число: ");
            InputNumbers[i] = input.nextInt();
        }

        input.close();

        Arrays.sort(InputNumbers);

        System.out.println("Наименьшее Из Введенных Вами Чисел: " + InputNumbers[0]);
    }
}