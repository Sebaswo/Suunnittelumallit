package Composite;

public class Main {
    public static void main (String[] args) {

        Laiteosa tietokone = new Tietokone();

        Laiteosa kotelo = new Kotelo(129.70);
            Laiteosa tuuletin1 = new Tuuletin(16.90);
            Laiteosa tuuletin2 = new Tuuletin(16.90);
            Laiteosa tuuletin3 = new Tuuletin(24.20);
            kotelo.lisääLaite(tuuletin1);
            kotelo.lisääLaite(tuuletin2);
            kotelo.lisääLaite(tuuletin3);
            Laiteosa virtalähde = new Virtalähde(85.90);
            kotelo.lisääLaite(virtalähde);

        Laiteosa emolevy = new Emolevy(229.35);
            Laiteosa muistipiiri1 = new Muistipiiri(2.59);
            Laiteosa muistipiiri2 = new Muistipiiri(2.59);
            Laiteosa muistipiiri3 = new Muistipiiri(2.59);
            emolevy.lisääLaite(muistipiiri1);
            emolevy.lisääLaite(muistipiiri2);
            emolevy.lisääLaite(muistipiiri3);
            Laiteosa prosessori = new Prosessori(319.90);
            emolevy.lisääLaite(prosessori);

        Laiteosa kovalevy = new Kovalevy(175.50);
        Laiteosa muisti = new Muisti(89.90);
        Laiteosa näytönohjain = new Näytönohjain(448.50);
        Laiteosa verkkokortti = new Verkkokortti(19);

        tietokone.lisääLaite(kotelo);
        tietokone.lisääLaite(emolevy);
        tietokone.lisääLaite(kovalevy);
        tietokone.lisääLaite(muisti);
        tietokone.lisääLaite(näytönohjain);
        tietokone.lisääLaite(verkkokortti);

        System.out.print("Tietokoneen hinta on: " + tietokone.getHinta());
    }
}
