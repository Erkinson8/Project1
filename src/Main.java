public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        BankAccount account = new BankAccount(15000);
        System.out.println("Ваш баланс: 15 000 сом");

        try {
            while (true) {
                account.withDraw(6000);
                System.out.println("Вы сняли 6000 сом.");
                account.getAmount();
                System.out.println("Ваш остаток: " + account.getAmount());
                account.deposit(500);
                System.out.println("Вы положили деньги на счет: 500 сом");
                System.out.println("Ваш остаток: " + account.getAmount());

            }

        } catch (LimitException e) {
            double remainingAmount = e.getRemainingAmount();
                System.out.println("Обнаружено ограничение: " + e.getMessage());
                System.out.println("Остаток: " + e.getRemainingAmount() + " сом");
                System.out.println("Выводим остаток:" + e.getRemainingAmount());
                System.out.println("Остаток: " + (e.getRemainingAmount() - e.getRemainingAmount()));

            }

        }
    }



