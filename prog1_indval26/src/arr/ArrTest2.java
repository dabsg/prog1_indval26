package arr;

import java.util.Scanner;

public class ArrTest2 {

    public static void main(String[] args) {
        
        int [] i = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("ange tal 1");
        i[0] = input.nextInt();

        System.out.println("ange tal 2");
        i[1] = input.nextInt();

        int summa= i[0]+i[1];
        System.out.println("summan blir"+summa);



    }
}
