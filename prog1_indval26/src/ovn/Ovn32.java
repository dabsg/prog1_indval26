package ovn;

import java.util.Arrays;
import java.util.Scanner;

public class Ovn32 {

    public static void main(String[] args) {
        int temp;
        int[] tal=new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("anget fösta talet");
        tal[0]= input.nextInt();

        System.out.println("anget andra talet");
        tal[1]= input.nextInt();

        System.out.println("anget tredje talet");
        tal[2]= input.nextInt();

       
        temp=tal[2];
        tal[2]=tal[0];
        tal[0]=temp;
        

        System.out.println(Arrays.toString(tal));


    }


}
