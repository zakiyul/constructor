package com.company;

public class Pegawai extends Id {
    public String nama;
    private final int gaji;

    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji =  gaji;
    }

    public int infoGaji(){
        return  gaji;
    }

    public void infoPegawai(){
        System.out.println("Nama : "+nama);
        System.out.println("Gaji : "+infoGaji());
    }
}
