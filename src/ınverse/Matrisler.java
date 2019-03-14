/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınverse;

import java.util.Arrays;

/**
 *
 * @author MehmetCan
 */
public class Matrisler {

    public String randomMatris[][];
    public double[][] randomMatris1;
    public int randomSatir;
    public int randomSutun;
    public String transMatris[][];
    public String middleMatris[][];

    public Matrisler(String[][] randomMatris, int randomSatir, int randomSutun) {
        this.randomSatir = randomSatir;
        this.randomSutun = randomSutun;
        this.randomMatris = Arrays.copyOf(randomMatris, randomMatris.length);

    }

    public Matrisler() {
    }

    public Matrisler(String[][] middleMatris,String[][] transMatris) {
        this.middleMatris = Arrays.copyOf(middleMatris, middleMatris.length);
        this.transMatris = Arrays.copyOf(transMatris, transMatris.length);
    }

    public String[][] getMiddleMatris() {
        return middleMatris;
    }

    public void setMiddleMatris(String[][] middleMatris) {//çarpılmış 3. adım sonu
        this.middleMatris = middleMatris;
    }

    public Matrisler(String[][] randomMatris, String[][] transMatris, int randomSatir, int randomSutun) { //A* A(transpoze)
        this.randomSatir = randomSatir;
        this.randomSutun = randomSutun;
        this.randomMatris = Arrays.copyOf(randomMatris, randomMatris.length);
        this.transMatris = Arrays.copyOf(transMatris, transMatris.length);

    }
    public Matrisler(double[][] randomMatris1, String[][] transMatris, int randomSatir, int randomSutun) { //A* A(transpoze)
        this.randomSatir = randomSatir;
        this.randomSutun = randomSutun;
        this.randomMatris1 = randomMatris1;
        this.transMatris = Arrays.copyOf(transMatris, transMatris.length);

    }

    public double[][] getRandomMatris1() {
        return randomMatris1;
    }

    public void setRandomMatris1(double[][] randomMatris1) {
        this.randomMatris1 = randomMatris1;
    }

    public String[][] getRandomMatris() {
        return randomMatris;
    }

    public String[][] getTransMatris() {
        return transMatris;
    }

    public void setTransMatris(String[][] transMatris) {
        this.transMatris = transMatris;
    }

    public void setRandomMatris(String[][] randomMatris) {
        this.randomMatris = randomMatris;
    }

    public int getRandomSatir() {
        return randomSatir;
    }

    public void setRandomSatir(int randomSatir) {
        this.randomSatir = randomSatir;
    }

    public int getRandomSutun() {
        return randomSutun;
    }

    public void setRandomSutun(int randomSutun) {
        this.randomSutun = randomSutun;
    }

    /*public String[][] getArray() {
     return Arrays.copyOf(randomMatris, randomMatris.length);
     }*/
    
    
     
}
