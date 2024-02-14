import java.util.*;
public class coisey {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr = new int [10];
        System.out.print("Enter 10 integers : " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(" ");
        una(arr);
        System.out.println(" ");
        dos(arr);
        System.out.println(" ");
        tres(arr);
        System.out.println(" ");
        apat(arr);
        System.out.println(" ");
        lima(arr);
    }
        static void una(int[] arr) {
        System.out.println("All inputted integers: " );
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
            
            }
        }
        
        static void dos(int[] arr) {
        System.out.println(" ");
        System.out.println("Integers in Reverse Order: " );
        for (int j = arr.length-1; j >= 0; j--) {
            System.out.print(arr[j]+ " ");
            
            }
        }

        static void tres(int[] arr) {
        int sum = 0;
        System.out.println(" ");
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
        System.out.println("Sum of Integers: " + sum );
        }

        static void apat(int[] arr) {
            System.out.println("Values less than 15: " );
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 15){
                    System.out.println(arr[i]); 
                }    
                }
            }

        static void lima(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            double ave = (double) sum / arr.length; // Calculate the average

            System.out.println("Values higher than the average " + ave + ":");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > ave) {
                    System.out.println(arr[i]);
                }
            }
}

}
       




