package Tutorial7.T7Q3;

public abstract class AcademicStaff  {
    //protected can be access in same package and their child
    protected double basicSalary;
    protected double transportationAllowance;
    protected double entertainmentAllowance;
    protected double housingAllowance;
    protected int serviceYear;


    public AcademicStaff(double basicSalary, double transportationAllowance, int serviceYear){
        this.basicSalary=basicSalary;
        this.transportationAllowance=transportationAllowance;
        this.serviceYear=serviceYear;
        this.entertainmentAllowance=calcEntertainmentAllowance();
        this.housingAllowance=calcHousingAllowance();
    }

    public AcademicStaff(){};

    public double calcEntertainmentAllowance(){
        if(serviceYear>=8){
            return 200;
        }
        return 0;
    };

    public double calcHousingAllowance(){ 
        if(serviceYear>=10){
            return 300;
        }
        return 0;
    };

    abstract void displayDetail();
}
