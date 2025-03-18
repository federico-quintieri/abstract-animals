package org.lessons.animali;

public abstract class AbstractAnimale {

    // Metodo concreto dormi per tutti gli animali
    public void dormi() {
        System.out.println("Zzz");
    }

    // Metodo astratto verso 
    public abstract void verso();
    // Metodo astratto mangia
    public abstract void mangia();
}
