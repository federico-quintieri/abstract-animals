package org.lessons.animali;

public class Main {
    public static void main(String[] args) {

        Cane cane = new Cane();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        Passerotto passerotto = new Passerotto();

        System.out.println("-- Cane --");
        cane.mangia();
        cane.verso();

        System.out.println("-- Aquila --");
        aquila.mangia();
        aquila.vola();

        System.out.println("-- Delfino --");
        delfino.mangia();
        delfino.verso();

        System.out.println("-- Passerotto --");
        passerotto.mangia();
        passerotto.verso();

        faiVolare(passerotto);
        faiNuotare(delfino);
        faiVolare(aquila);

    }

    static void faiVolare(IVolante animaleVolante) {
        animaleVolante.vola();
    }

    static void faiNuotare(INuotante animaleNuotante) {
        animaleNuotante.nuota();
    }
}
