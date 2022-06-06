package jatekmenet;

public class kincs {
    private int ertek;
    private String forma;
    
    public kincs(int ertek){
        this.ertek = ertek;
    }

    public kincs(int ertek, String forma) {
        this.ertek = ertek;
        this.forma = forma;
    }

    public int getErtek() {
        return ertek;
    }

    public String getForma() {
        return forma;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
