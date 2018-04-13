package org.formation.java;

public class Calculatrice {

    double resultat;

    boolean Bplus;
    boolean Bmoins;
    boolean Bfois;
    boolean Bdiv;
    static String plus = "+";
    static String moins = "-";
    static String egal = "=";
    static String fois = "*";
    static String div = "/";

    Calculatrice(){
        setResultat(0.0d);
        setBfois(false);
        setBdiv(false);
        setBmoins(false);
        setBplus(false);
    }



    public void setBdiv(boolean bdiv) {
        Bdiv = bdiv;
    }

    public void setBfois(boolean bfois) {
        Bfois = bfois;
    }

    public boolean isBdiv() {
        return Bdiv;
    }

    public boolean isBfois() {
        return Bfois;
    }

    public boolean isBmoins() {
        return Bmoins;
    }

    public boolean isBplus() {
        return Bplus;
    }

    public double getResultat() {
        return resultat;
    }

    public String getDiv() {
        return div;
    }

    public String getEgal() {
        return egal;
    }

    public String getFois() {
        return fois;
    }

    public String getMoins() {
        return moins;
    }

    public String getPlus() {
        return plus;
    }

    public void setBmoins(boolean bmoins) {
        Bmoins = bmoins;
    }

    public void setBplus(boolean bplus) {
        Bplus = bplus;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public void setEgal(String egal) {
        this.egal = egal;
    }

    public void setFois(String fois) {
        this.fois = fois;
    }

    public void setMoins(String moins) {
        this.moins = moins;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    public void addition(char lettre ){
        this.resultat+=Double.parseDouble(""+lettre);
    }

    public void division(char lettre ){
        this.resultat/=Double.parseDouble(""+lettre);
    }

    public void soustraction(char lettre ){
        this.resultat-=Double.parseDouble(""+lettre);
    }

    public void multiplication(char lettre ){
        this.resultat*=Double.parseDouble(""+lettre);
    }

    @Override
    public String toString() {
        return ""+getResultat();
    }

    void Calculer(String liste){
        setResultat(Double.parseDouble(""+liste.charAt(0)));
        for (int i = 1; i <liste.length() ; i++) {
            char contenu = liste.charAt(i);

            if (Bplus==true){
                addition(liste.charAt(i));
                setBplus(false);
            }

            if (Bdiv==true){
                division(liste.charAt(i));
                setBdiv(false);
            }

            if (Bfois==true){
                multiplication(liste.charAt(i));
                setBdiv(false);
            }

            if (Bmoins==true){
                soustraction(liste.charAt(i));
                setBmoins(false);
            }

            if(Character.toString(contenu).equals(plus)){
                setBplus(true);
            }
            if (Character.toString(contenu).equals(moins)){
                setBmoins(true);
            }
            if (Character.toString(contenu).equals(div)){
                setBdiv(true);
            }
            if (Character.toString(contenu).equals(fois)){
                setBfois(true);
            }
        }
        System.out.println(toString());
    }
}
