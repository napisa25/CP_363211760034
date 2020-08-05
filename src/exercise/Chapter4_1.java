package exercise;
import java.util.Scanner;
public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a test 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter b test 2:" );
        int b = scanner.nextInt();
        System.out.print("Enter c test 3: ");
        int c = scanner.nextInt();
        System.out.print("Enter d test 4: ");
        int d = scanner.nextInt();
        System.out.print("Enter f test 5: ");
        int f = scanner.nextInt();
        System.out.print("Enter e test 6: ");
        int e = scanner.nextInt();
        System.out.print("Enter m test 7: ");
        int m = scanner.nextInt();
        System.out.print("Enter y test 8: ");
        int y = scanner.nextInt();
        System.out.print("Enter u test 9: ");
        int u = scanner.nextInt();
        System.out.print("Enter k test 10: ");
        int k = scanner.nextInt();

        int total = a + b + c+ d + f + e + m + y + u + k;
        int avg = total / 10;
        System.out.println("Total :" + total);
        System.out.println("Average :" + avg);




    }//main



}//class
