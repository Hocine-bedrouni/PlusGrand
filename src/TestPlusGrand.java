import java.sql.SQLOutput;
import java.util.Scanner;

public class TestPlusGrand {
    public static void main(String[] args) {

        int a;
        System.out.println("Pour arreter de jouer taper 0 comme 1 er chiffre");
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("Entrez 1er chiffre");
            a = sc.nextInt();

            System.out.println("Entrez 2er chiffre");
            int b = sc.nextInt();

            System.out.println("Entrez 3er chiffre");
            int c = sc.nextInt();

            if ((a > b) && (a > c)) {
                System.out.printf("le max est %d", a);
            } else {
                if (b > a && b > c) {
                    System.out.printf("le max est %d", b);
                } else {
                    System.out.printf("le max est %d", c);
                }
            }
        }  while (a != 0) ;
        System.out.println("Merci d'avoir jouer");
    }
}