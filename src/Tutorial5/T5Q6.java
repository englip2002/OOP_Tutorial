package Tutorial5;

public class T5Q6 {
    public static boolean validateID(String loginID) {
        int numOfLower = 0, numOfDigit = 0;
        if (loginID.length() < 6 || loginID.length() > 10) {
            return false;
        }

        if (!Character.isUpperCase(loginID.charAt(0))) {
            return false;
        }

        for (int i = 0; i < loginID.length(); i++) {
            if (!Character.isLetterOrDigit(loginID.charAt(i))) {
                return false;
            }

            if (Character.isLowerCase(loginID.charAt(i))) {
                numOfLower++;
            }
            else if (Character.isDigit(loginID.charAt(i))) {
                numOfDigit++;
            }
        }

        if (numOfDigit < 1 || numOfLower < 1)
            return false;

        return true;
    }

    public static void main(String[] args) {
        String loginID = "Tan2002";
        System.out.println(validateID(loginID));
    }
}
