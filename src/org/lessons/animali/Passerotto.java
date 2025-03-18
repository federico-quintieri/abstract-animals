package org.lessons.animali;

public class Passerotto extends AbstractAnimale implements IVolante {

    // Faccio override dei metodi astratti della classe madre
    @Override
    public void verso() {
        System.out.println("Piu Piu");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
