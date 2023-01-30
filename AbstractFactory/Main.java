package AbstractFactory;

public class Main {

    //argsia voi muuttaa Suunnittelumallit/.vscode/launch.json
    public static void main(String[] args) throws Exception{
        if (args[0].toLowerCase().equals("boss")) {
            try {
                Class c = Class.forName("AbstractFactory.BossFactory");
                AbstractFactory af = (AbstractFactory)c.getDeclaredConstructor().newInstance();
                Person jasper = new Person(af);
                jasper.getDressed();
                System.out.println("\nInsinöörinä Jasper kertoi brassaillen:\n");
                System.out.println(jasper.toString());
            } catch (Exception e) {System.out.println(e);}

        } else if (args[0].toLowerCase().equals("adidas")) {
            Class c = Class.forName("AbstractFactory.AdidasFactory");
                AbstractFactory af = (AbstractFactory)c.getDeclaredConstructor().newInstance();
                Person jasper = new Person(af);
                jasper.getDressed();
                System.out.println("Opiskeluaikoina Jasper kertoi ylpeänä:\n");
                System.out.println(jasper.toString());
        } else {
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
}
