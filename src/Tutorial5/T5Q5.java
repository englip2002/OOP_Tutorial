package Tutorial5;

public class T5Q5 {
    public static void main(String[] args) {
        String cardNum="1234567896531234";
        System.out.println(validateCreditCardNumber(cardNum));
    }

    public static boolean validateCreditCardNumber(String cardNum) {
        if (cardNum.length() != 16)
            return false;

        for (int i = 0; i < cardNum.length(); i++) {
            if (!Character.isDigit(cardNum.charAt(i)))
                return false;
        }

        return true;
    }
}
