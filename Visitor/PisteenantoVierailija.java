package Visitor;

public class PisteenantoVierailija implements Vierailija {

    @Override
    public void visit(Mario mario) {
        mario.tee();
        if (mario.getTila() == "pieni"){
            mario.setPisteet(mario.getPisteet()+5);
        } else {
            mario.setPisteet(mario.getPisteet()+20);
        }
       System.out.println("Pisteitä tuli! Marion pisteet nyt: " + mario.getPisteet());
    }

    @Override
    public void visit(Luigi luigi) {
        luigi.tee();
        if (luigi.getTila() == "pieni"){
            luigi.setPisteet(luigi.getPisteet()+4);
        } else {
            luigi.setPisteet(luigi.getPisteet()+19);
        }
        System.out.println("Pisteitä tuli! Luigin pisteet nyt: " + luigi.getPisteet());
    }
    
}
