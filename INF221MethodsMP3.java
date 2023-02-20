/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf221.methods.mp3;

/**
 *
 * @author ASUS
 */
public class INF221MethodsMP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter how many inputs: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        
        for(int i = 0; i < num.length; i++){
            System.out.print("Enter number [" + (i+1) + "]: ");
            num[i] = sc.nextInt();
        }
        
        System.out.println("The average value is: " + average(num , n));
    }
    
    public static double average(int[] arr , int limit){
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            sum += arr[i];
        }
        return sum / limit;
    }
    
}
