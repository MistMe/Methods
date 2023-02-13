public class MP1 {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println("The number "+ num + " is Even");
        } else {
           System.out.println("The number "+ num + " is not Even"); 
        }
    }

    public static boolean isEven(int n){
        if(n % 2 == 0) 
            return true;
        else 
            return false;
    }
}
