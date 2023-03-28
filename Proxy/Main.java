package Proxy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(final String[] arguments) {

        ArrayList<Image> album = new ArrayList<Image>();
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        album.add(new ProxyImage("HiRes_10MB_Photo1", "20.3.2023", 2783));
        album.add(new ProxyImage("HiRes_10MB_Photo2", "25.3.2023", 1977));
        album.add(new ProxyImage("HiRes_10MB_Photo3", "26.3.2023", 2292));
        album.add(new ProxyImage("HiRes_10MB_Photo4", "28.3.2023", 2566));
        
        for (Image i : album) {
            i.showData();
        }

        while (choice != 0) {
            System.out.println("Which image do you want to view (of " + album.size() + ")? 0 closes the album.");
            choice = scanner.nextInt();
            if (choice > album.size() || choice < 0) {
                System.out.println("No such image found, choose between 0 and " + album.size());
            } else if (choice == 0) {
                System.out.println("Closing the album.");
                System.exit(-1);
            } else {
                album.get(choice-1).displayImage();
            }
        }
        scanner.close();
    }
}
