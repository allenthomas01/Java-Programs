// program to count the number of occurences of a particular character in a string.
import java.util.Scanner;
class Count{
    int flag=0;
    Count(String string,char key){
        for(int i=0;i<string.length();i++){
            if(key==string.charAt(i)){
                flag++;
            }
        }
        System.out.print("The string has "+flag+" "+ key+ "'s");
    }

}
//driver code
public class FrequencyCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        System.out.print("Enter the character to count: ");
        char key = sc.next().charAt(0);
        Count obj1 = new Count(string,key);
        sc.close();
    }
}
