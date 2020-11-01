package com.company;

public class Bertelur extends MakhlukHidup {
    String namaHewan;
    public Bertelur(String namaHewan){
        this.namaHewan = namaHewan;
    }
    public void info(){
        System.out.println("Nama hewan bertelur adalah "+namaHewan);
    }
}
