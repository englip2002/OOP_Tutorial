package Tutorial6.T6Q6;

public class OverdraftAccount extends Account {
    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;

    public OverdraftAccount(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate,
            String accountType) {
        this.setAccountNo(accountNo);
        this.setAccountHolderName(accountHolderName);
        this.setAccountBalance(accountBalance);
        this.setAnnualInterestRate(annualInterestRate);
        this.accountType = accountType;

        if(this.accountType.equalsIgnoreCase("Premium")){
            overdraftLimit=-10000;
            overdraftInterestRate=0.05;
        }
        else if(this.accountType.equalsIgnoreCase("Gold")){
            overdraftLimit=-5000;
            overdraftInterestRate=0.065;
        }
        else{
            overdraftLimit=-2000;
            overdraftInterestRate=0.1;
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public void setOverdraftInterestRate(double overdraftInterestRate) {
        this.overdraftInterestRate = overdraftInterestRate;
    }

    @Override
    public void cashOut(double cash){
        if(cash>getAccountBalance()+(-overdraftLimit))
            System.out.println("Withdrawal Failed");
        else
            this.setAccountBalance(getAccountBalance()-cash);
    }

    @Override
    public double calculateInterest(){
        if(getAccountBalance()<0){
            return getAccountBalance()*getAnnualInterestRate();
        }
        else
            return getAccountBalance()*overdraftInterestRate;
    }

    @Override
    public String toString(){
        return String.format("%sAccount Type: %s\nOverdraft Limit: %.2f\nOverdraft Interest Rate: %.2f\n",super.toString(),accountType,overdraftLimit,overdraftInterestRate);
    }

}
