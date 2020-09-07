/*4. Ввести целое число в консоли.
Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2;
если нулевым, то заменить его на 10. Вывести полученное число.
 */

package AllTasks;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("К положительному числу будет прибавлена единица." + "\n");
        System.out.print("Из отрицательного числа будет вычтено 2." + "\n");
        System.out.print("Нулевое число будет приравнено к 10." + "\n");
        System.out.print("Введите ваше число: ");

        int Number = input.nextInt();

        input.close();

        if (Number > 0)
        {
            Number++;
        }

        else if (Number < 0)
        {
            Number = Number - 2;
        }

        else
        {
            Number = 10;
        }

        System.out.print("Конечное число: " + Number);
    }
}