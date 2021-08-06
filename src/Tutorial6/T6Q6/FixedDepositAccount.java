package Tutorial6.T6Q6;

public class FixedDepositAccount extends Account {
    private int savingYears;

    public FixedDepositAccount(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate, int savingYears) {
        //super(accountNo, accountHolderName, accountBalance, annualInterestRate);
        this.setAccountNo(accountNo);
        this.setAccountHolderName(accountHolderName);
        this.setAccountBalance(accountBalance);
        this.setAnnualInterestRate(annualInterestRate);
        this.savingYears=savingYears;
    }

    FixedDepositAccount(){};

    public int getSavingYears() {
        return savingYears;
    }

    public void setSavingYears(int savingYears) {
        this.savingYears = savingYears;
    }

    @Override
    public double calculateInterest(){
        return getAccountBalance()*getAnnualInterestRate()*savingYears;
    }

    @Override
    public String toString(){
        return String.format("%sSaving Years: %d\n",super.toString(),savingYears);
    }

}
