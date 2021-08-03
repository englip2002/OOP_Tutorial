package Tutorial5;

public class T5Q4 {
    public static boolean nameValidate(String userName){
        if(userName.length()<6)
            return false;
        else if(userName.indexOf(" ")!=-1)
            return false;
        else 
            return true;
    }

    public static void main(String[] args){
        String userName="Jason Chai";

        System.out.println(nameValidate(userName));

    }




}
