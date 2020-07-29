package Lab2;

import java.util.Scanner;

public class Basiclnput {
     public static void main (String[] args) {

         Scanner scanner = new Scanner(System.in);


         System.out.print("Enter you name ?: ");
         String mame = scanner.nextLine();

         System.out.println("Your name is "+mame);

         System.out.print("อายุเท่าไร ?:");
         int age = scanner.nextInt();
         System.out.println("อายุของคุณคือ "+ age);

         System.out.print("Enter you nick name ?:");
         String nickname = scanner.nextLine();
         System.out.println("Your nick name is" +nickname);








     }//main


}//class
