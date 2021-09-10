public class BankAccount {
    // Static
    public static int numAccounts = 0;
    public static double totalAmount = 0;


    // Attributes
    private double checkingBalance;
    private double savingsBalance;

    // Constructor 
    public BankAccount() {
        BankAccount.numAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    // Getters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // Methods
    public void depositMoney(double amount, String account) {
        if(account.equals("savings"))
            this.savingsBalance += amount;
        else if (account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalAmount += amount;
    }

    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingsBalance - amount >= 0) {
                successful = true;
                this.savingsBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0) {
                successful = true; 
                this.checkingBalance -= amount;
            }
        }
        if(successful) {
            BankAccount.totalAmount -= amount;
        }
    }

    public void displayBalance() {
        System.out.println(String.format("Savings has %.2f, Checking has %.2f", this.savingsBalance, this.checkingBalance));
    }
}
