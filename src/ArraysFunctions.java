/*
Implementing various inbuilt functions of array class in java
 */
import java.util.Arrays;
public class ArraysFunctions {
    public static void main(String[] args) {
        int[] arr = {23,34,54,32,45,67,89,22,233,3432,4534,12};
        //first function - toString which will convert the array into string
        String str = Arrays.toString(arr);
        System.out.println(str);

        //second function - copyOf which creates a copy of original array
        //case 1 - when newLength is equal to originalLength
        int[] brr1 = Arrays.copyOf(arr,arr.length);
        System.out.println("Case 1 - brr1");
        System.out.println(Arrays.toString(brr1));
        //case 2 - when newLength is greater than OriginalLength
        int[] brr2 = Arrays.copyOf(arr,15);
        System.out.println("Case 2 - brr2");
        System.out.println(Arrays.toString(brr2));
        //case 3 - when newLength is smaller than OriginalLength
        int[] brr3 = Arrays.copyOf(arr,2);
        System.out.println("Case 3 - brr3");
        System.out.println(Arrays.toString(brr3));

        //third function - copyOfRange which copy original array from specified range
        int[] crr = Arrays.copyOfRange(arr,0,12);
        System.out.println("crr");
        System.out.println(Arrays.toString(crr));

        //fourth function - sort which arrange the elements of array in increasing order
        int[] drr = Arrays.copyOf(arr,arr.length);
        //sorting drr
        Arrays.sort(drr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(drr));
    }
}
