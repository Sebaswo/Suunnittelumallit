package Memento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pelaajamaara;
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        System.out.println("Montako pelaajaa osallistuu?");
        pelaajamaara = sc.nextInt();

        Asiakas[] pelaajat = new Asiakas[pelaajamaara];

        for (int i = 1; i <= pelaajamaara; i++) {
            pelaajat[(i-1)] = new Asiakas(i, arvuuttaja);
        }

        for (Asiakas as : pelaajat) {
            as.start();
        }

        sc.close();
    }
}
