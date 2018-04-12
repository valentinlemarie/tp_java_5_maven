package org.formation.java.animals;

import org.formation.java.animal.Animal;
import org.formation.java.origin.Carnivore;

public class Lion extends Animal {

    Lion(int age, float poids, String noms,   float taille){
        super(age, poids, noms, taille);
        this.regime=new Carnivore(age, poids, noms, taille);
    }



    /*
    public void manger(Aliment aliment){
        if(Carnivore.mange.contains(aliment)){
            System.out.println("le Lion a mange "+aliment.toString());
        }else{
            System.out.println("le Lion ne mange pas de "+aliment.toString());
        }
    }
    public void deplacer(){
        System.out.println("un Lion ce déplace");
    }
    */
}
