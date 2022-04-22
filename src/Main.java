public class Main {
    public static void main(String[] args) {
        int priceTicket = 200; // Цена билета
        int constRub = 20; // Константа за 1 милю

        int mile = priceTicket / constRub; // Расчёт

        System.out.println("За цену билета в " + priceTicket + " рублей, начислено " + mile + " миль."); // Вывод в консоль

    }
}