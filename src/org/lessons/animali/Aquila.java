package org.lessons.animali;

public class Aquila extends AbstractAnimale implements IVolante {

    // Faccio override dei metodi astratti della classe madre
    @Override
    public void verso() {
        System.out.println("Tf is a kilometeeerrr");
    };

    @Override
    public void mangia() {
        System.out.println("Carne");
    };

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
