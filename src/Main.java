public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили
        int ticketPrice = 13_676;
        int oneBonus = 20;
        int bonusTotal = ticketPrice / oneBonus;
        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        System.out.println("Итого за данный перелет было начислено " + bonusTotal + " бонусов");
    }
}