/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertar;

/**
 *
 * @author bodnart
 */
public class Hattertar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hdd[] eszkozok = new Hdd[5];
        eszkozok[0] = new Hdd("Izé", 7200, 500, 220.0);
        eszkozok[1] = new Hdd();
        eszkozok[1].setRpm(7200);
        
        eszkozok[2] = new Hdd("Kingston", 540);
        eszkozok[2].setRpm(5400);
        
        eszkozok[3] = new Hdd("toshiba", 5400, 500, 210.0);
        eszkozok[4] = new Hdd("Drive", 15);
        eszkozok[4].setRpm(9800);
        
        for (int i = 0; i < eszkozok.length; i++) {
            System.out.print("A ");
            eszkozok[i].kiirNev();
            System.out.print(" tároló ");
            eszkozok[i].kiirKapacitas();
            System.out.print(" Gb kapacitású, és ");
            eszkozok[i].kiirSzabadHely();
            System.out.println(" Gb szabad hely van rajta.");
        }
        int tempKapacitas = 0;
        double tempSzabadHely = 0;
        for (Eszkoz eszkozok1 : eszkozok) {
            tempKapacitas += eszkozok1.getKapacitas();
            tempSzabadHely += eszkozok1.getSzabadHely();
        }

        System.out.print("Összesen ");
        System.out.print(tempKapacitas + " Gb tárhely, és ezeken összesen ");
        System.out.print(tempSzabadHely + " Gb szabad hely áll rendelkezésre.");
        
        for (int i = 0; i < eszkozok.length; i++) {
         
            System.out.print(eszkozok[i].getRandomAccessTime() + ", ");
        }
        SSD ssd1 = new SSD(1000, "ssd1", 500, 480);
        ssd1.setIrasSzam(1000);
        System.out.println("");
        System.out.println(ssd1.getRandomAccessTime());
        System.out.println(ssd1.write(10));
        System.out.println(ssd1.irasSzam);
    
    }
    
    }
