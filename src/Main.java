public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int replenishment = 900;
        boolean e;
        e = replenishment > 1000;
        int bonus = (int) (replenishment * 0.01);

        if (e) {
            int amount = replenishment + balance + bonus;
            System.out.println(amount);
            System.out.println(bonus);
        } else {
            int i = replenishment + balance;
            System.out.println(i + " Рублей");
            System.out.println(bonus*0 + " Бонусов");

        }

    }
}