import java.util.Scanner;

public class TwoDArrayColumnSwap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows, columns, temp;
        System.out.println("Enter number of rows in 2-d array: ");
        rows = scan.nextInt();
        System.out.println("Enter the number of columns in 2-d array:");
        columns = scan.nextInt();

        int[][] twoDArray = new int[rows][columns];

        System.out.println("Input the elements into the 2-d Array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the column to swap: ");
        int column1 = scan.nextInt();
        int column2 = scan.nextInt();

        System.out.println("Given Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Swapping");

        for (int i = 0; i < rows; i++) {
            temp = twoDArray[i][column1];
            twoDArray[i][column1] = twoDArray[i][(column2)];
            twoDArray[i][column2] = temp;
        }
        System.out.println("Swapped Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
