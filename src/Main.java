public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        BankAccount account = new BankAccount();
        account.deposit(15000);
        System.out.println("Ваш баланс: " + account.getAmount() + " сом");


        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Снять 6000 сом.");
                System.out.println("Ваш остаток: " + account.getAmount());
                //System.out.println("Снять 6000 сом.");

            } catch (LimitException e) {
                System.out.println("Снять 6000 сом.");
                System.out.println(e.getMessage());
                try {
                    account.withDraw((int) account.getAmount());
                } catch (LimitException ex) {
                   // throw new RuntimeException(ex);
              }
                System.out.println("Снять оставшуюся сумму: "
                + e.getRemainingAmount());
                System.out.println("Остаток успешно снят со счета!");
                System.out.println("Остаток на счете: "
                        + account.getAmount());
                break;

            }
        }
    }
}












