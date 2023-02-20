/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf211.methods.mp6;

/**
 *
 * @author ASUS
 */
public class INF211MethodsMP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        if(isPrime(n)){
            System.out.println("The number is prime");
        } else {
            System.out.println("The number NOT is prime");
        }
    }
    
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i+=1){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
}
