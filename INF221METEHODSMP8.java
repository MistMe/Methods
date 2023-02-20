/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf221.metehods.mp8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class INF221METEHODSMP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        menu();
        
    }
    
    
    public static void menu() {
        java.util.Scanner sc = new Scanner (System.in);
        
        System.out.println("Press <L> for Left triangle");
        System.out.println("Press <R> for Right triangle");
        System.out.println("Press <C> for Center triangle");
     
        char a = sc.next().charAt(0);
        
        switch  (a){
            case 'l','L':
                leftTriangle();
                break;
            case 'r', 'R':
                //call out method for Right triangle
                rightTriangle();
                break;
            case 'c', 'C':
                //call out method for center triangle
                centerTriangle();
                break;
        }
    }   
       public static  void leftTriangle() {
          Scanner sc=new Scanner (System.in);
           System.out.print("ENTER SIZE:");
            int n= sc.nextInt();
            for (int rows=1; rows<=n; rows++){
                for(int column=1; column<=rows; column++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            
       }
       
       public static  void rightTriangle() {
          Scanner sc=new Scanner (System.in);
           System.out.print("ENTER SIZE:");
            int n= sc.nextInt();
            for (int rows=1; rows<=n; rows++){
                for(int space = n; space > rows; space--){
                    System.out.print(" ");
                }
                for(int column=1; column<=rows; column++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            
       }
       
       public static  void centerTriangle() {
          Scanner sc=new Scanner (System.in);
           System.out.print("ENTER SIZE:");
            int n= sc.nextInt();
            for (int rows=1; rows<=n; rows++){
                for(int space = n; space > rows; space--){
                    System.out.print(" ");
                }
                for(int column=1; column<=rows*2-1; column++){
                        System.out.print("*");
                }
                System.out.print("\n");
            }
            
       }
}
