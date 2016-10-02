/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertar;

/**
 *
 * @author user
 */
public abstract class Eszkoz {

    private String nev;
    private int kapacitas;
    private double szabadHely;
    
    public Eszkoz() {
    }
   public Eszkoz(String nev, int kapacitas, double szabadHely) {
       this.nev = nev;
       this.kapacitas = kapacitas;
       if(szabadHely > kapacitas){
           szabadHely = kapacitas;
       }
       this.szabadHely = szabadHely;
   }

    public Eszkoz(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
        this.szabadHely = kapacitas;
    }

   public void kiirNev(){
       System.out.print(nev);
   }
   public void kiirKapacitas(){
       System.out.print(kapacitas);
   }
   public void kiirSzabadHely(){
       System.out.print(szabadHely);
   }
   public abstract double getRandomAccessTime();
   public abstract double write(int Gb);
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public double getSzabadHely() {
        return szabadHely;
    }

    public void setSzabadHely(double szabadHely) {
        this.szabadHely = szabadHely;
    }
   
}
