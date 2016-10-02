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
public class SSD extends Eszkoz{
    protected int irasSzam;

    public SSD() {
    }

    public SSD(int irasSzam, String nev, int kapacitas, double szabadHely) {
        super(nev, kapacitas, szabadHely);
        this.irasSzam = irasSzam;
    }

    public SSD(int irasSzam, String nev, int kapacitas) {
        super(nev, kapacitas);
        this.irasSzam = irasSzam;
    }

    public int getIrasSzam() {
        return irasSzam;
    }

    public void setIrasSzam(int irasSzam) {
        this.irasSzam = irasSzam;
    }

    @Override
    public double getRandomAccessTime() {
        double accessTime = -1;
        if(irasSzam > 0){
            accessTime = 1;
        }
        return accessTime;
    }
    @Override
    public double write(int Gb) {
        irasSzam = irasSzam - 1;
        return super.getSzabadHely() - Gb;
        
    }
    
}
