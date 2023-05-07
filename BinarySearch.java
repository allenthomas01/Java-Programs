//program to implement binary search algorithm
import java.util.Scanner;
class Check{
    Scanner sc = new Scanner(System.in);
    int arr[],count,temp,first,last,mid;
    Check(int count){
        arr=new int[count];
        //reading the array
        for(int i=0;i<count;i++){
            arr[i]= sc.nextInt();
        }

        //sorting the array
        for(int i=0;i<count;i++){
            for(int j=0;j<count-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    int search(int key,int count){
        //binary search 
        first=0;
        last=count-1;
       while(first<=last){
        mid=first+(last-first)/2;  
            if(key==arr[mid]){
                return mid;
               
            }
            else if(key>arr[mid]){
                first=mid+1;  
                
            }
            else if(key<arr[mid]){
                last=mid-1;

            }
        }
        return -1;
    }
}
//driver code
class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of list: ");
        int count = sc.nextInt();
        System.out.println("Enter the numbers");
        Check obj1=new Check(count);
        System.out.print("Enter number u want to search: ");
        int key=sc.nextInt();
        int result=obj1.search(key,count);
        if(result==-1){
            System.out.println("The number is not in list");
        }
        else{
            System.out.println("Element found at index "+result);
        }
        sc.close();

    }
}