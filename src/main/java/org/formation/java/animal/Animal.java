package org.formation.java.animal;

public abstract class Animal {
    int age;
    float poids;
    String noms;
    float taille;
    public Regime regime;

    public Animal(int age, float poids, String noms, float taille){
        this.age = age ;
        this.poids = poids ;
        this.noms = noms;
        this.taille = taille ;
    }
    public void manger(Aliment aliment) {
        this.regime.manger(aliment);
    }

    public void deplacer(){
        System.out.println(this.noms+" se déplace");
    };
}
