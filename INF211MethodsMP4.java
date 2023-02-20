/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf211.methods.mp4;

/**
 *
 * @author ASUS
 */
public class INF211MethodsMP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        
        System.out.println("Number of vowel: " + isVowel(name));
    }
    
    public static int isVowel(String text){
        int count = 0;
        text = text.toUpperCase();
        for(int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){
                case 'A' , 'E' , 'I' , 'O' , 'U':
                    count++;
                    break;
            }
        }
        return count;
    }
    
}
