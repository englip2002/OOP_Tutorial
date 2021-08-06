package Tutorial6.T6Q6;

public class T6Q6 {
    public static void main(String[] args) {
        FixedDepositAccount FixAcc = new FixedDepositAccount(126, "David", 100, 1.2, 3);

        OverdradtAccount[] overAcc=new OverdradtAccount[3];

        overAcc[0]=new OverdradtAccount(123, "Adam", 1000, 1.2, "Premium");
        overAcc[1]=new OverdradtAccount(124, "Brian", 30, 1.2, "Gold");
        overAcc[2]=new OverdradtAccount(125, "Christian", -100, 1.2, "Silver");

 
        for(int i=0;i<3;i++)
            System.out.println(overAcc[i].toString()+"\n");
        
        System.out.println(FixAcc.toString());

        //if cash out 1900 can if 2000 cannot because alrd -100
        overAcc[2].cashOut(1900);
        System.out.println(overAcc[2].getAccountBalance());


    }

}
