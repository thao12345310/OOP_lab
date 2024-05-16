package OtherProjects.hust.soict.ict.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + "\n" + "Sum: " + sum + ". Average: " + sum/n);
    }
}
