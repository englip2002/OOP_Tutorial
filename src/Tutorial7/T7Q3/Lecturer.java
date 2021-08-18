package Tutorial7.T7Q3;

public class Lecturer extends AcademicStaff {
    private String position;
    private String holder;

    public Lecturer(String position, String holder, int serviceYear) {
        super(0, 220,serviceYear); //initialize transportation allowance
        this.position=position;
        this.holder=holder;

        if (position.equalsIgnoreCase("JL")) {
            if (holder.equalsIgnoreCase("degree"))
                basicSalary = 1600;
            else if (holder.equalsIgnoreCase("master"))
                basicSalary = 2300;
            else
                basicSalary = 3000;

        } else {
            if (holder.equalsIgnoreCase("degree"))
                basicSalary = 2300;
            else if (holder.equalsIgnoreCase("master"))
                basicSalary = 3000;
            else
                basicSalary = 3500;
        }

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public void displayDetail(){
        System.out.println(position+"("+holder+")");
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Transportation Allowance: "+transportationAllowance);
        System.out.println("Entertainment Allowance: "+entertainmentAllowance);
        System.out.println("Housing Allowance: "+housingAllowance+"\n");
    }

}
