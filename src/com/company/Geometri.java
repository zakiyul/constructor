package com.company;

import static java.lang.Math.pow;

public class Geometri {
    int banyak;
    int awal;
    int rasio;

    public Geometri(int banyak,int awal,int rasio){
        this.banyak = banyak;
        this.awal = awal;
        this.rasio = rasio;
        System.out.println("__Geometri__");
    }

    public int deret(){
        int deret = (int) (awal * ((1-pow(rasio,banyak)) / (1-rasio)));
        return deret;
    }

    public void barisan(){
        for(int a = 1; a <= banyak; a++){
            awal = (int) (awal * pow(rasio, a-1));
            System.out.println(a + " -> "+ awal);
        }
    }
}
