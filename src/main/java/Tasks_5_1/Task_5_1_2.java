package Tasks_5_1;

public class Task_5_1_1 {
    public static void main(String[] args) {
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int sum = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 1; i < array.length; i++){
            sum += array[i];
            System.out.println(sum);
        }
    }
}
