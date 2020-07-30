/*
Processing array to print the sum of all the elements of an array
 */

public class ProcessingArray {
    public static void main(String[] args) {
        //declaration and initialization of array
        int[] array = {10,20,30,40,50};
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum = "+sum);
    }
}
