/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf221.methods.mp7;

/**
 *
 * @author ASUS
 */
public class INF221MethodsMP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        System.out.println(isEven(n));
    }
    
    public static boolean isEven(int num){
        while(num != 0){
            if(num % 2 != 0){
                //System.out.println(num);
            } else {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    
}
