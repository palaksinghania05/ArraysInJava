/*
To demonstrate different ways of initializing array
 */

import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        //first way
        //by initializing all items individually one by one
        System.out.println("First method");
        arr[0]=200;
        arr[1]=10;
        arr[2]=150;
        arr[3]=45;
        arr[4]=58;
        System.out.println("Array values 1");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        //for bringing cursor to new line
        System.out.println();
        //second way
        //by user input one by one
        System.out.println("Second method");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        arr[0]=sc.nextInt();
        System.out.println("enter an integer");
        arr[1]=sc.nextInt();
        System.out.println("enter an integer");
        arr[2]=sc.nextInt();
        System.out.println("enter an integer");
        arr[3]=sc.nextInt();
        System.out.println("enter an integer");
        arr[4]=sc.nextInt();
        System.out.println("Array values 2");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        //for bringing cursor to new line
        System.out.println();
        //third and most efficient way
        System.out.println("Third method");
        System.out.println("Enter 5 integers");
        for(int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array values 3");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        //for bringing cursor to new line
        System.out.println();
        sc.close();
    }
}
