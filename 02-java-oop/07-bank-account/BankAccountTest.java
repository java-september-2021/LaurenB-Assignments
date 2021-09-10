public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount accounts = new BankAccount();
        accounts.depositMoney(50, "checking");
        accounts.depositMoney(100, "savings");
        accounts.displayBalance();
        System.out.println(BankAccount.totalAmount);

        accounts.withdrawMoney(10, "checking");
        accounts.withdrawMoney(50, "savings");
        accounts.displayBalance();
        System.out.println(BankAccount.totalAmount);
    }

}
