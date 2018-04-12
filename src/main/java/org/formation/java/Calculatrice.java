package org.formation.java;

public class Calculatrice {

    double resultat ;

    boolean Bplus;
    boolean Bmoins;
    boolean Bfois;
    boolean Bdiv;
    String plus = "+";
    String moins = "-";
    String egal = "=";
    String fois = "*";
    String div = "/";

    void Calculer(String liste){
         this.resultat =liste.charAt(0);

        for (int i = 1; i <liste.length() ; i++) {

            char contenu = liste.charAt(i);





            if (Bplus==true){
                this.resultat+=Double.parseDouble(Character.toString(liste.charAt(i)));
                Bplus=false;
            }

            if (Bdiv==true){
                this.resultat/=Double.parseDouble(Character.toString(liste.charAt(i)));
                Bdiv=false;
            }

            if (Bfois==true){
                this.resultat*=Double.parseDouble(Character.toString(liste.charAt(i)));
                Bfois=false;
            }

            if (Bmoins==true){
                this.resultat-=Double.parseDouble(Character.toString(liste.charAt(i)));
                Bmoins=false;
            }

            if(Character.toString(contenu).equals(plus)) Bplus=true;
            if (Character.toString(contenu).equals(moins))Bmoins=true;
            if (Character.toString(contenu).equals(div))Bdiv=true;
            if (Character.toString(contenu).equals(fois))Bfois=true;
        }
    }
}
