package com.company;

public class JumlahGaji extends Gaji {
    double all;

    public void gaji(){
        JumlahGaji jumlahGaji = new JumlahGaji();
        jumlahGaji.g_pokok(1800000);
        jumlahGaji.t(400000);
        jumlahGaji.t1(300000);
        jumlahGaji.t2(200000);
        jumlahGaji.t3(100000);

        System.out.println("Gaji Pokok \t : Rp. "+jumlahGaji.gGp()+",-");
        System.out.println("Gaji tunjangan 1 \t : Rp. "+jumlahGaji.gT1()+",-");
        System.out.println("Gaji tunjangan 2 \t : Rp. "+jumlahGaji.gT2()+",-");
        System.out.println("Gaji tunjangan 3 \t : Rp. "+jumlahGaji.gT3()+",-");
        System.out.println("Gaji tunjangan 4 \t : Rp. "+jumlahGaji.gT()+",-");

        all = (double) jumlahGaji.gGp() + jumlahGaji.gT1() + jumlahGaji.gT2() + jumlahGaji.gT3() + jumlahGaji.gT();
    }

    public double all(){
        return  all;
    }
}
