package Tasks_3_2;

public class Task_3_2_3 {
    public static void main(String[] args) {

        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}
