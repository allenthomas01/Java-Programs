//Program to check whether string is palindrome or not
import java.util.Scanner;
class CheckPalindrome{
    int check(String userString){
        int j = userString.length()-1;
        for(int i=0;i<userString.length();i++){
            if(userString.charAt(i)==userString.charAt(j)){
                j--;
                continue;
            }
            else{
                return -1;
            }
        }
        return 0;
    }

}

// driver code
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = sc.nextLine();
        CheckPalindrome obj1 = new CheckPalindrome();
        obj1.check(userString);
        if(obj1.check(userString)==0){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
