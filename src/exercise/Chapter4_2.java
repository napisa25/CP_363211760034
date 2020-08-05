package exercise;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main (String[] args){
        //รับข้อมูล จำนวนเต็ม  และจำนวนจริง  สลับกัน  สังเกตผลการทำงาน
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter real number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter integer: ");
        int c = scanner.nextInt();
        System.out.print("Enter real number: ");
        double d = scanner.nextDouble();
        //display
        System.out.println(a +" "+b+" "+c+" "+d);

    }//main

}
