package Singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ministeri> ministerit = new ArrayList<Ministeri>();

        System.out.println("Luodaan Suomeen presidentti ja ministerit!");
        System.out.println("Mikä on presidentin nimi?");
        String nimi = sc.nextLine();
        SuomenPresidentti.getInstance().setNimi(nimi);
        System.out.println("Montako ministeriä luodaan?");
        int lkm = sc.nextInt();
        String s = sc.nextLine();
        for (int i = 0; i < lkm; i++) {
            System.out.println("Kerro " + (i+1) + ". ministerin nimi:");
            String minNimi = sc.nextLine();
            ministerit.add(new Ministeri(minNimi));
        }
        
        System.out.println("Loit loistavan johdon suomeen! Presidenttinäqds: " + SuomenPresidentti.getInstance().getNimi() + "\n");
        System.out.println("Sekä ministerit:");
        for(Ministeri m: ministerit) {
            System.out.println(m.getNimi());
        }
    }
}
