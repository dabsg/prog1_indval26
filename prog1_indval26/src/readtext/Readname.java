package readtext;

import java.util.Scanner;

public class Readname {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ange ditt namn");

        String name=sc.next();
        
        System.out.println("ange ålder");

        String age=sc.next();

        System.out.println("hej "+name+"du är "+age+" år gammal");


    }
}
