import java.util.Scanner;
public class MP5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number "+ (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int smallest = smallestValue(arr);
        System.out.println("The Smallest Value is: " + smallest);
        sc.close();
    }   
    public static int smallestValue(int[] arr){
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
