import java.util.Scanner;

public class CheckSymmetricMatrix {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int rows, columns;
            System.out.println("Enter number of rows in 2-d array: ");
            rows = scan.nextInt();
            System.out.println("Enter the number of columns in 2-d array:");
            columns = scan.nextInt();

            int[][] Array = new int[rows][columns];

            System.out.println("Input the elements into the 2-d Array");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Array[i][j] = scan.nextInt();
                }
            }

            System.out.println("Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(Array[i][j] + " ");
                }
                System.out.println("");
            }

            boolean symmetric = true;
            if (rows != columns){
                symmetric = false;
            } else{
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if(Array[i][j] != Array[j][i]){
                            symmetric = false;
                            break;
                        }
                    }
                }
            }
            if(symmetric==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

