package les_3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/* Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

public class Main {
    public static void main(String[] args) {

        // CREATE LIST //////////////////////
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(11));
        }
        System.out.println(list);

        // DELETE EVEN NUMBERS ///////////////////////
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        // FIND MIN AND MAX VALUES ///////////////
        int min = list.get(0);
        int max = list.get(0);

        for (int i : list) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);

        // FIND AVERAGE //////////////////////
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("The average is " + sum / list.size());

    }
}
