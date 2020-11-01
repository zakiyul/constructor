package com.company;

public class Mamalia extends MakhlukHidup {
    String namaHewan;

    public Mamalia(String namaHewan){
        this.namaHewan = namaHewan;
    }

    public void info(){
        System.out.println("Nama hewan mamalia adalah "+namaHewan);
    }
}
