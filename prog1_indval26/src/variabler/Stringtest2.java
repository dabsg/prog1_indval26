package variabler;

public class Stringtest2 {
public static void main(String[] args) {
    
String namn ="Daniel Andersson";

int nummer=namn.indexOf(' ');

char eInitsial=namn.charAt(nummer+1);
System.out.println(eInitsial);

int textLängd=namn.length();

char sistaBokstaven=namn.charAt(textLängd-1);

System.out.println(textLängd+""+sistaBokstaven);

String delAvNamn=namn.substring(11,12);
System.out.println(delAvNamn);
}
}
