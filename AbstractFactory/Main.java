package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Opiskeluaikoina Jasper kertoi ylpeänä:\n");
        Person kouluJasper = new Person(new AdidasFactory());
        kouluJasper.getDressed();
        System.out.println(kouluJasper.toString());

        
        System.out.println("\nInsinöörinä Jasper kertoi brassaillen:\n");
        Person tyoJasper = new Person(new BossFactory());
        tyoJasper.getDressed();
        System.out.println(tyoJasper.toString());


        
    }
}
