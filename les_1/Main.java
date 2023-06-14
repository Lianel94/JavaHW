package les_1;

import java.util.Arrays;
import java.util.Random;

/* 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!) */

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = new Random().nextInt(0, 2000 + 1);
        System.out.println(i);
        int n = bitMax(i);
        System.out.println(n);

        // кратные n числа в диапазоне от i до Short.MAX_VALUE

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0)
                System.out.println(j);
        }

        // некратные n числа в диапазоне от Short.MIN_VALUE до i

        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0)
                System.out.println(k);
        }

    }

    // номер старшего значащего бита выпавшего числа
    static int bitMax(int i) {
        int n = 1;
        if (i >= n << 16)
            n <<= 16;
        if (i >= n << 8)
            n <<= 8;
        if (i >= n << 4)
            n <<= 4;
        if (i >= n << 2)
            n <<= 2;
        if (i >= n << 1)
            n <<= 1;
        return n;
    }
}
