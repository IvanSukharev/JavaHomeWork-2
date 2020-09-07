/*Задача 6. Ввести целое число в консоли.
Вывести его строку - описание вида «отрицательное четное число», «нулевое число»,  «положительное нечетное число» и т. д.
 */

package AllTasks;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите Ваше Число: ");

        int Number = input.nextInt();

        input.close();

        String FirstDescription = "";
        String SecondDescription = "";

        if (Number > 0 && Number % 2 == 0)
        {
            FirstDescription = "Положительное ";
            SecondDescription = "И Четное";
        }

        else if (Number < 0 && Number % 2 == 0)
        {
            FirstDescription = "Отрицательное ";
            SecondDescription = "И Четное";
        }

        else if (Number > 0 && Number % 2 != 0)
        {
            FirstDescription = "Положительное ";
            SecondDescription = "И Нечетное";
        }

        else if (Number < 0 && Number % 2 != 0)
        {
            FirstDescription = "Отрицательное ";
            SecondDescription = "И Нечетное";
        }

        else
        {
            FirstDescription = "Равно ";
            SecondDescription = "Нулю";
        }

        System.out.print("Ваше Число " + FirstDescription + SecondDescription);
    }
}