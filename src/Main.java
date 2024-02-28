public class Main {
    public static void main(String[] args) {

        int balance = 100;// Объявляете переменные для входных данных и
        int value = 1100;// параметров программы: начального счёта,
        int score = 0;// суммы пополнения и тп
        int bonusBalance;

        if (value > 1000) {
            score = value / 100;
            balance = balance + value;
            bonusBalance = balance + score;
            System.out.print("Баланс пополнен на " + value + " рублей." + " Бонусный счет пополнен на " + score + " баллa/ов. Текущий баланс " + bonusBalance + " рублей.");

        } else {
            balance = balance + value;
            bonusBalance = balance + score;
            System.out.print("Баланс пополнен на " + value + " рублей." + " Бонусный счет пополнен на " + score + " баллa/ов. Текущий баланс " + bonusBalance + " рублей.");


        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}