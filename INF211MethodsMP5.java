/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf211.methods.mp5;

/**
 *
 * @author ASUS
 */
public class INF211MethodsMP5 {

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
        
        System.out.println("The largest value is " + max(num));
    }
    
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i+=1){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
