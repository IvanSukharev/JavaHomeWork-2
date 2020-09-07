//Задача 2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа

package AllTasks;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите Трехзначное Число: ");

        int Number = input.nextInt();

        input.close();

        String NumberToText = String.valueOf(Number);

        int Sum = 0;

        for(int i=0; i<3; i++)
        {
            Sum = Sum + Character.getNumericValue(NumberToText.charAt(i));
        }

        System.out.print("Сумма Всех Цифр В Вашем Числе: " + Sum);
        }
    }