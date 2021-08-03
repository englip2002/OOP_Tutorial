package Tutorial3;

public class T3Q6 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(averageInArray(array));
    }

    public static double averageInArray(int[] array) {
        int total=0;
        for (int num : array) {
            total+=num;
        }
        return total/array.length;
    }
}
