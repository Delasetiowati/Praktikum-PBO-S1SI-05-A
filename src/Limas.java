/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shanju 
 */
public class Limas {
        sgtSamaSisi segitiga;
        Persegi persegi;
        double ls, lp;
        //konstruktor
        public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1,
        double Py1, double Px2, double Py2) {
        segitiga = new sgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        ls = segitiga.luasSegitigaSamaSisi();
        persegi = new Persegi(Px1, Py1, Px2, Py2);
        lp = persegi.luasPersegi();
        }
        public double LuasLimas() {
        return (4 * ls) + lp;
        }
        public void tampil() {
        segitiga.tampil();
        persegi.tampil();
        System.out.println("Luas Limas : " + LuasLimas());
        }
        }
