package Tutorial6.T6Q6;

public class Account {
    private int accountNo;
    private String accountHolderName;
    private double accountBalance;
    private double annualInterestRate;

    public Account(){};

    public Account(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void cashIn(double cash){
        accountBalance+=cash;
    }

    public void cashOut(double cash){
        accountBalance-=cash;
    }

    public double calculateInterest(){
        return accountBalance*annualInterestRate;
    }

    public String toString(){
        return String.format("Account Number: %s\nAccount Holder Name: %s\nAccount Balance: %.2f\n", accountNo,accountHolderName,accountBalance);
    }

}
