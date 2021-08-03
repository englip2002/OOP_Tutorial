package Tutorial3;

public class T3Q7 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(largestInArray(array));
    }

    public static int largestInArray(int[] array) {
        int largest = array[0];
        for (int num : array) {
            if (num > largest) 
                largest = num;
        }
        return largest;
    }
}
