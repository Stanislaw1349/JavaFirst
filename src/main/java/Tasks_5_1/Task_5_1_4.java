package Tasks_5_1;

public class Task_5_1_4 {
    public static void main(String[] args) {
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
