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
public class Hdd extends Eszkoz{
    
    protected int rpm;
    
    public Hdd() {
    }

    public Hdd(String nev, int rpm, int kapacitas, double szabadHely) {
        super(nev, kapacitas, szabadHely);
        this.rpm = rpm;
    }

    public Hdd(String nev, int kapacitas) {
        super(nev, kapacitas);
    }
  
    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if (rpm == 0){
            rpm = 5400;
        }
        this.rpm = rpm;
    }
    @Override
    public double getRandomAccessTime(){
        double accessTime = (1/((double)rpm / 60)) * 1000 / 2 + 5;
        return accessTime;
    }

    @Override
    public double write(int Gb) {
        return super.getSzabadHely() - Gb;
    }
    
}

