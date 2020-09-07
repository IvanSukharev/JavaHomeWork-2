//Задача 1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.

package AllTasks;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите Число: ");
        int Number = input.nextInt();
        input.close();

        String NumberToText = String.valueOf(Number);

        int TextLenght =  NumberToText.length();

        System.out.print("Последняя Цифра В Вашем Числе: " + NumberToText.charAt(TextLenght - 1));
    }
}