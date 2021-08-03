package Tutorial4.Q10;

public class Account {
    // - means private access modifier
    // ~ means default access modifier
    // + means public access modifier
    // # means protected access modifier
    // underline means static

    private int accountNo;
    private String accountHolderName;
    private double balance;
    int accountCount;
    private static double annualInterestRate = 0.014;

    public Account(int accountNo, String accountHolderName, double accountBalance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = accountBalance;
        accountCount++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public int accountCount() {
        return accountCount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void cashIn(double cash) {
        balance += cash;
    }

    public void cashOut(double cash) {
        if(cash>balance){
            System.out.println("Invalid Balance\n");
        }
        else{
            balance -= cash;
        }
    }

    public double calculateInterest() {
        return balance * annualInterestRate;
    }

}
