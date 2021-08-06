package Tutorial6.T6Q6;

public class T6Q6 {
    public static void main(String[] args) {
        FixedDepositAccount fixAcc = new FixedDepositAccount(126, "David", 100, 0.012, 3);

        OverdraftAccount[] overAcc=new OverdraftAccount[3];

        overAcc[0]=new OverdraftAccount(123, "Adam", 1000, 1.2, "Premium");
        overAcc[1]=new OverdraftAccount(124, "Brian", 30, 1.2, "Gold");
        overAcc[2]=new OverdraftAccount(125, "Christian", -100, 1.2, "Silver");

 
        for(int i=0;i<3;i++)
            System.out.println(overAcc[i].toString()+"\n");
        
        System.out.println(fixAcc.toString());

        //if cash out 1900 can if 2000 cannot because alrd -100
        overAcc[2].cashOut(2000);
        System.out.println("The account balance of "+overAcc[2].getAccountHolderName()+" is "+overAcc[2].getAccountBalance());

        //fixed account calculate interest
        System.out.println("The amount of interests for "+fixAcc.getAccountHolderName()+" is RM"+fixAcc.calculateInterest());


    }

}
