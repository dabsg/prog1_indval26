package ovn;

import java.util.Scanner;

public class ovn23 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("ange ålder");

    int age=sc.nextInt();

    int ental=(int) (age/10.0);

    int nolladeSenast= ental *10 ;

    int nollarNästa=nolladeSenast+10;

    int kvar= nollarNästa-age;

    System.out.println("du fyller "+nollarNästa+" om "+kvar+" år");

}
}
