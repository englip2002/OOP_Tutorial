package Tutorial7.T7Q3;

public class ProgramSupervisor extends AcademicStaff{
    private double administrativeAllowance;
    public ProgramSupervisor(int serviceYear){
        super(3500, 300,serviceYear);
        administrativeAllowance=400;
    }

    public double getAdministrativeAllowance() {
        return administrativeAllowance;
    }

    public void setAdministrativeAllowance(double administrativeAllowance) {
        this.administrativeAllowance = administrativeAllowance;
    }

    @Override
    public void displayDetail(){
        System.out.println("Program Supervisor");
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Transportation Allowance: "+transportationAllowance);
        System.out.println("Administrative Allowance: "+administrativeAllowance);
        System.out.println("Entertainment Allowance: "+entertainmentAllowance);
        System.out.println("Housing Allowance: "+housingAllowance+"\n");
    }

}
