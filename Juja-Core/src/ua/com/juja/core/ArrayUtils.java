package ua.com.juja.core;

/**
 * Created by DM on 20.12.2015.
 */
/*На вход подается одномерный массив. Необходимо, найти диапазон максимальной ширины, элементы которого положительные (больше 0)
        В качестве ответа должен быть массив из 2х элементов, где
        - элемент №0 - индекс элемента левой границы отрезка
        - элемент №1 - индекс элемента правой границы отрезка
        Если таких отрезков несколько - вернуть самый левый. Если в массиве нету такого отрезка (все числа отрицательны) - вернуть пустой массив.
        Например
        lookFor([1, 1, 1]) = [0, 2]
        lookFor([0, 1, 1]) = [1, 2]
        lookFor([1, 1, 0]) = [0, 1]
        lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
        lookFor([1, 1, 0, 1, 1]) = [0, 1] // возвращаем левый
        lookFor([0, -1, 0, -1]) = []*/ // нету положительных чисел

public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] expected = new int[2];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
            if (count == 1){
                expected[0] = i;
            }
            if ((array[i] <= 0) || (count == array.length)) {
                expected[1] = count - 1;
            }

        }
        return expected;

    }
}