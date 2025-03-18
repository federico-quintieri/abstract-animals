package org.lessons.animali;

public class Delfino extends AbstractAnimale implements INuotante {

    // Faccio override dei metodi astratti della classe madre
    @Override
    public void verso() {
        System.out.println("Soundwaves");
    };

    @Override
    public void mangia() {
        System.out.println("Pesci");
    };

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }
}
