import java.util.Scanner;
public class MP2 {
    
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number "+ (i+1) + ": ");
            num[i] = sc.nextInt();
       }
        int sum = total(num);
        System.out.println("The total sum is: " + sum);
    }
    public static int total(int[] num) {
        int sum = 0;
        for (int number: num){
            sum += number;
        }
        return sum;
    }
}



