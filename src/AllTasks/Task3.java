/*Задача 3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1.
В противном случае не изменять его. Вывести полученное число.
*/

package AllTasks;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите Ваше Число." + "\n");
        System.out.print("Если оно положительное, оно увеличится на единицу: ");

        int Number = input.nextInt();

        input.close();

        if (Number > 0)
        {
            Number++;
        }

        System.out.print("Конечное Число: " + Number);
    }
}