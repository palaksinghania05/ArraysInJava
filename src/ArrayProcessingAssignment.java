/*
Create an application to print sum of all the even elements
present in the given array
int[] arr= {13,15,17,14,19,181,2,15,22,24,23,12,56,86,89,87,87,89,84,84,81,5,4}
 */
public class ArrayProcessingAssignment {
    public static void main(String[] args) {
        int[] arr = {13,15,17,14,19,181,2,15,22,24,23,12,56,86,89,87,87,89,84,84,81,5,4};
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
