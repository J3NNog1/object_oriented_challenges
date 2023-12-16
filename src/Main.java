public class Main {
    public static void main(String[] args) {

        BankAccount jennsAccount = new BankAccount();

        jennsAccount.setBalance(1000);
        jennsAccount.setNumber("34567");
        jennsAccount.setCustomerName("jennifer j");
        jennsAccount.setCustomerEmail("jenn@gmail.com");
        jennsAccount.setCustomerPhone("347-333-4444");


        jennsAccount.depositFunds(200.00);
        jennsAccount.withdrawFunds(100.00);
        jennsAccount.depositFunds(300);
        jennsAccount.withdrawFunds(500);
    }
}