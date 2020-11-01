package com.company;

public class Aritmatika {
    int banyak;
    int awal;
    int jarak;

    public Aritmatika(int banyak,int awal,int jarak){
        this.banyak = banyak;
        this.awal = awal;
        this.jarak = jarak;
        System.out.println("__Aritmatika__");
    }

    public int deret(){
        for(int a = 1; a <= banyak; a++){
            awal += a * jarak;
        }
        return  awal - jarak;
    }

    public void barisan(){
        System.out.println("Barisan");
        for(int a = 1; a<=banyak; a++){
            awal = a*jarak;
            System.out.println(a+" -> "+awal);
        }
    }
}
