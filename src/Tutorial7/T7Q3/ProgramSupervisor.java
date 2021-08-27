package Tutorial7.T7Q3;

public class ProgramSupervisor extends AcademicStaff {
    private double administrativeAllowance;

    public ProgramSupervisor(int serviceYear) {
        super(3500, 300, serviceYear);
        administrativeAllowance = 400;
    }

    @Override
    public void displayDetail() {
        System.out.println("Program Supervisor");
        System.out.println("----------------------");
        System.out.println("Basic Salary            : RM" + basicSalary);
        System.out.println("Transportation Allowance: RM" + transportationAllowance);
        System.out.println("Administrative Allowance: RM" + administrativeAllowance);
        System.out.println("Entertainment Allowance : RM" + entertainmentAllowance);
        System.out.println("Housing Allowance       : RM" + housingAllowance);
        System.out.println("Total monthly salary for this Program Supervisor is RM " + (basicSalary
                + transportationAllowance + entertainmentAllowance + administrativeAllowance + housingAllowance));
        System.out.println("Year of Service: " + serviceYear + "\n");
    }

}
