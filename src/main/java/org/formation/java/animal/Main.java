package org.formation.java.animal;

import org.formation.java.animals.Homme;
import org.formation.java.animals.Hyene;
import org.formation.java.animals.Lapin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal lapin = new Lapin(25,90,"Lapinou",19.5f);
        Animal hyene = new Hyene(25,90,"Hyenette",110.0f);
        Animal homme = new Homme(25,90,"LE MARIE valentin",192.2f);

        Aliment aliment1 = Aliment.HERBE;
        Aliment aliment2 = Aliment.ANTOLOPPE;
        lapin.deplacer();
        lapin.manger(aliment1);
        lapin.manger(aliment2);
        hyene.deplacer();
        hyene.manger(aliment1);
        hyene.manger(aliment2);
        homme.deplacer();
        homme.manger(aliment1);
        homme.manger(aliment2);
    }
}
