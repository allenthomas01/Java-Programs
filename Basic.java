import java.util.*;

class OutputFormat{
void stringformat(){
    System.out.printf("--------------------------------%n");
System.out.printf(" Java's Primitive Types         %n");
System.out.printf(" (String printf example)        %n");

System.out.printf("--------------------------------%n");
System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
System.out.printf("--------------------------------%n");

System.out.printf("| %-10s | %-8s | %4s |%n", "Floating", "double",  "0064");
System.out.printf("| %-10s | %-8s | %4s |%n", "Floating", "float",   "0032");
System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "long",    "0064");
System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "int",     "0032");
System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "char",    "0016");
System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "short",   "0016");
System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "byte",    "0008");
System.out.printf("| %-10s | %-8s | %4s |%n", "Boolean",  "boolean", "0001");

System.out.printf("--------------------------------%n");
}
}
public class Basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("0.End 1.Output-Formatting  ");
            System.out.print("Enter your choice(number): ");
            choice = sc.nextInt();
            switch(choice){
                case 1 :{
                    OutputFormat obj1 = new OutputFormat();
                    obj1.stringformat();
                }
            }
        }while(choice!=0);
    }
}
