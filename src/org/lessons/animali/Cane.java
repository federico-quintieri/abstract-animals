package org.lessons.animali;

public class Cane extends AbstractAnimale {

    // Faccio override dei metodi astratti della classe madre
    @Override
    public void verso() {
        System.out.println("Bau Bau");
    };

    @Override
    public void mangia() {
        System.out.println("Carne");
    }
}
