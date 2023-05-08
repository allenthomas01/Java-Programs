import java.util.Scanner;
class Matrix{
    Scanner sc = new Scanner(System.in);
    int arr[][],res[][],row,col;
    void read(){
        System.out.println("Enter order of matrix (row and column respectively)");
        this.row = sc.nextInt();
        this.col = sc.nextInt();
        arr = new int[row][col];

    System.out.println("Enter array elements");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            this.arr[i][j]=sc.nextInt();
        }
      }
    }

}

class Multiply{
    int res[][];
    // multiplying the matrices.    
    void multiply(int arr[][],int brr[][],int row1,int col1,int row2,int col2){
        res = new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                for(int k=0;k<row2;k++){
                    res[i][j]+=arr[i][k]*brr[k][j];                        
                }
                    
            }
                
        }
        System.out.println("The resultant matrix is: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print("\t"+res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

// driver code

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Details of Matrix A");
        Matrix matrix1 = new Matrix();
        matrix1.read();
        System.out.println("Details of Matrix B");
        Matrix matrix2 = new Matrix();
        matrix2.read();
        if(matrix1.col!=matrix2.row){
            System.out.println("Multiplication of matrices not possible.\nChange the order of matrices to mxn and nxp form.");
        }
        else{
            Multiply obj = new Multiply();
            obj.multiply(matrix1.arr, matrix2.arr,matrix1.row, matrix1.col, matrix2.row, matrix2.col);
        }
        sc.close();

    }
}
