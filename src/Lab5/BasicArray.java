package Lab5;
public class BasicArray {
    public static void main(String[] args) {
        int number[] = new int[5];  // 5 block(int) ค่าเริ่มต้น คือ 0

        System.out.println(number[0]); // ตำแหน่งที่ (index) 0
        System.out.println(number[1]); // ตำแหน่งที่ (index) 1
        System.out.println(number[2]); // ตำแหน่งที่ (index) 2
        System.out.println(number[3]); // ตำแหน่งที่ (index) 3
        System.out.println(number[4]); // ตำแหน่งที่ (index) 4
        number[0] = 100;
        System.out.println(number[0]); // ตำแหน่งที่ (index) 0
        displayArray(number);
        //วิธีการกำหนดค่าเก็บไว้ใน array คือ การระบุตำแหน่งของ array
        number[4] = 500;
        number[3] = number[0]*8;  // number[3] = 100*8 = 800
        number[2] = number[3]/4; // 800/4
        displayArray(number);
        number[0] = 1000;  //1000 จะไปแทนที่ 100 เพราะ 1 block เก็บได้เพียง 1 ค่า
        // การใช้เครื่องหมาย 😊)
        int x[] = {1, 2, 3, 4, 5};
        int y[] = {1, 2, 3, 4, 5};
        // x = y
        int z[] = x;
        // z = x
        if (z==x){
            System.out.println("z == x");
        }

    }//main
    private static void displayArray(int[] number) {
        System.out.println("Data in array: ");
        for (int val:number){
            System.out.print(val+" ");
        }
    }
}//class