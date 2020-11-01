package com.company;

public class DataPenggajian {

    Pegawai pegawai = new Pegawai("Ali Fikri",1500000);
    JumlahGaji jumlahGaji = new JumlahGaji();

    public DataPenggajian(){
        System.out.println("==[GAJI & TUNJANGAN GURU]==");
    }

    public void dataPenggajian(){
        pegawai.infoPegawai();
        pegawai.jabatan();
        jumlahGaji.gaji();
        System.out.println("============================");
        System.out.println("Total gaji pokok + Tunjangan : Rp. "+jumlahGaji.all()+",-");
    }
}
