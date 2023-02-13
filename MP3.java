import java.util.Scanner;
public class MP3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Elements: ");
        int no = sc.nextInt();
        double[] num = new double[no];
        for (int i = 0; i < no; i++) {
            System.out.print("Enter the number "+ (i+1) + ": ");
            num[i] = sc.nextDouble();
        } 
        System.out.println("The Average of the elements is: " + average(num));
        sc.close();
    }
    public static double average(double[] arr){
        double sum = 0;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum/arr.length;


}
}


