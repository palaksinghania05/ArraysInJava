/*
Declare, Initialize and Print an array
 */
public class SimpleArray {
    public static void main(String[] args) {
        //declare an array
        int[] arr;
        //create or initialize an array
        arr = new int[5];
        //printing an array to check default value
        System.out.println("Default values");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        //for bringing cursor to new line
        System.out.println();
        System.out.println("Testing nextline");
    }
}
