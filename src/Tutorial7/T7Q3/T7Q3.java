package Tutorial7.T7Q3;

public class T7Q3 {
    public static void main(String[] args){
        AcademicStaff[] staff=new AcademicStaff[3];
        staff[0]=new Lecturer("JL", "Master", 0);
        staff[1]=new Lecturer("SL", "phD", 10);
        staff[2]=new ProgramSupervisor(8);

        for(int i=0;i<staff.length;i++){
            //it will use the method that overrided but not the AcademicStaff's displayDetail
            //if no override will use original one
            staff[i].displayDetail(); 
        }
    }
}
