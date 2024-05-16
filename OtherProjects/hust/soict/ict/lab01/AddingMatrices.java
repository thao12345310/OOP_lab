package OtherProjects.hust.soict.ict.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class AddingMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n =sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];
        System.out.println("Enter matrix a: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix b: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
