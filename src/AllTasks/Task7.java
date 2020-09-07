/*Задача 7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
 */

package AllTasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Для получения стоимости 10 минут разговора: " + "\n");
        System.out.print("Введите Код Города: ");

        String InputCityCode = input.next();

        input.close();

        String[] CityCodes = {"Москва (Код Города 905): 4.15 руб", "Ростов (Код Города 194):  1.98руб",
                "Краснодар (Код Города 491): 2.69руб", "Киров(800) - 5.00руб"};

        for (int i = 0; i < 4; i++)

        {
            if (CityCodes[i].contains(InputCityCode))
            {
                System.out.println(CityCodes[i]);
                break;
            }

            else
                {
                    ;
                }
            System.out.println("Введеного Вами Кода Города Не Существует В Справочнике.");
        }
    }
}