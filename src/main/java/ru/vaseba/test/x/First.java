package ru.vaseba.test.x;

import java.util.ArrayList;
import java.util.List;

/** Напишите программу на Java для переворачивания строки,
 *  изменив расположение символов в строке задом наперёд
 *  без использования встроенных в String функций
 * */

public class First {

    public static void main(String[] args) {

        String s = "Some text";
        StringBuilder stB = new StringBuilder();
        stB.append(s);
        stB = stB.reverse();

        System.out.println(stB);

        String s1 = "Учимся программировать";
        char symbols[] = s1.toCharArray();

        for (int x = symbols.length - 1; x >= 0; x--) {
            System.out.print(symbols[x]);
        }

    }
}
