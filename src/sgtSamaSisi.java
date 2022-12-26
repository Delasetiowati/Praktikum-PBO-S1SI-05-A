/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shani channnnnnnnnnnnnnn
 */
public class sgtSamaSisi extends titik{
        private double sisiSegitiga = super.hitungJarak(this);
        //konstruktor
        public sgtSamaSisi(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        }
        //menghitung jarak antar titik
        public void jtSegitigaSamaSisi() {
        super.hitungJarak(this);
        }
        //menghitung luas persegi
        public double luasSegitigaSamaSisi() {
        return 0.5 * sisiSegitiga * Math.sqrt(3);
        }
        public void tampil() {
        System.out.println(" ");
        System.out.println("====DATA Segitiga====");
        tampilTitik();
        System.out.println("Sisi Segitiga : " + sisiSegitiga);
        System.out.println("Luas Segitiga : " + luasSegitigaSamaSisi());
        System.out.println(" ");
        }
        }

