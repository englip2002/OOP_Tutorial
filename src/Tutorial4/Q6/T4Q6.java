package Tutorial4.Q6;

public class T4Q6 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("XYZ 0001", 250000, 2005, 100);

        airplane1.setId("AWX 0003");
        airplane1.setNumOfPassanger(190);

        System.out.println(airplane1.toString()+"\n");
        System.out.println(airplane2.toString());
    }
}
