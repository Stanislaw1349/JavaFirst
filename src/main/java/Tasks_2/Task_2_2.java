package Tasks_2;

public class Task_2_2 {
    public static void main(String[] args) {

        /*Создать программу дележа добычи на пиратском корабле.По обычаю, половина добычи идет владельцу корабля, половина
        оставшегося —капитану, остальное делится поровну между всеми членами команды, включая капитана.
        Размер добычи(например, в пиастрах) и количество пиратов на корабле задать переменными.
        Вывести на экран кому сколько пиастров полагается
        Сколько получит капитан(Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему ?
        Дополнительное задание со звездочкой
        Попробовать придумать как программа может проверить правильность дележа.*/

        int loot = 999;
        int pirates = 25;

        int remaining = loot;

        int shipOwnerLoot = remaining / 2;
        remaining = remaining - shipOwnerLoot;

        int captainLoot = remaining / 2;
        remaining = remaining - captainLoot;

        int eachPirateLoot = remaining / (pirates + 1);
        captainLoot = captainLoot + eachPirateLoot;

        remaining  = remaining - eachPirateLoot * (pirates + 1);



        System.out.println("Владельцу " + shipOwnerLoot);
        System.out.println("Капитану " + captainLoot);
        System.out.println("Каждому пирату " +  eachPirateLoot);
        System.out.println("Остаток на ром " + remaining);
        System.out.println("Если капитан Джек Воробей владалец " + (shipOwnerLoot + captainLoot));

        System.out.println(shipOwnerLoot + captainLoot + eachPirateLoot * pirates + remaining);
    }
}
