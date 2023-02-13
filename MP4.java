import java.util.Scanner;
public class MP4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name/word: ");
        String word = sc.nextLine();
        System.out.println("Number of Vowels: " + Vowel(word));
}

    public static int Vowel(String word){
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
        char ch = word.charAt(i);
        if (ch >= 'a' && ch <= 'z' && isVowel(ch)) {
        count++;    
        }
        }
        return count;
    }
    public static boolean isVowel(char ch){
        switch (ch) {
            
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            return true;
            default:
            return false;
        }
}
}
