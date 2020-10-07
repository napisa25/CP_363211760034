package Lab5;
import java.util.Scanner;
public class InputDataToArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        //input data to array
        num = inputData(num);
        //display data in array
        displayArray(num);
        //find total value in array
        findTotalValue(num);
        //findmax
        findmax(num);
        //findmin
        findmin(num);

    }//main
    private static void findmin(int[] num) {
        int min = num[0];
        for (int val:num){
            if (min >= val)
                min = val;
        }
        System.out.println(" maxium value is "+min);
    }
    private static void findmax(int[] num) {
        int max = num [0];
        for (int val:num){
            if (max <= val)
                max = val;
        }
        System.out.println("The maxium value is "+max);
    }
    private static void findTotalValue(int[] num) {
        int total = 0;
        for (int val:num){
            total += val;
        }
        System.out.println("Total value in array:"+total);
        System.out.println("average value in array:"+(total/ num.length));
    }
    private static void displayArray(int[] num) {
        System.out.println("Data in array: ");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) { //num.lengh คือขนาดของ array
            System.out.println("Enter integer (index)" +i+ ": ");
            num[i] = sc.nextInt();
        }
        return num;
    }
}//class