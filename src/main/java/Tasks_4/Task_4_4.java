package Tasks_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task_4_4 {
    public static void main(String[] args) {
        //Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
        //Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
        // Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
