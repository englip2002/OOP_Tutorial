package Tutorial7.T7Q3;

public class Lecturer extends AcademicStaff {
    private String position;
    private String holder;

    public Lecturer(String position, String holder, int serviceYear) {
        super(0, 0, serviceYear); //initilize service year
        this.holder = holder;

        if (position.equalsIgnoreCase("JL")) {
            this.transportationAllowance = 220;
            this.position = "Junior Lecturer";
            if (holder.equalsIgnoreCase("degree"))
                basicSalary = 1600;
            else if (holder.equalsIgnoreCase("master"))
                basicSalary = 2300;
            else
                basicSalary = 3000;

        } else {
            this.position = "Senior Lecturer";
            this.transportationAllowance = 270;
            if (holder.equalsIgnoreCase("degree"))
                basicSalary = 2300;
            else if (holder.equalsIgnoreCase("master"))
                basicSalary = 3000;
            else
                basicSalary = 3500;
        }

    }

    @Override
    public void displayDetail() {
        System.out.println("Lecturer");
        System.out.println("-------------");
        System.out.println("Basic Salary            : RM" + basicSalary);
        System.out.println("Transportation Allowance: RM" + transportationAllowance);
        System.out.println("Entertainment Allowance : RM" + entertainmentAllowance);
        System.out.println("Housing Allowance       : RM" + housingAllowance);
        System.out.println("Total monthly salary for this " + position + "(" + holder + ") is RM "
                + (basicSalary + transportationAllowance + entertainmentAllowance + housingAllowance));
        System.out.println("Year of Service: " + serviceYear + "\n");
    }
}
