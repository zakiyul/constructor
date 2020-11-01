package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		DataPenggajian dataPenggajian = new DataPenggajian();
		dataPenggajian.dataPenggajian();

        System.out.println("==[MAKHLUK HIDUP]==");
	    MakhlukHidup makhlukHidup = new MakhlukHidup();
	    makhlukHidup.info();
	    Mamalia mamalia = new Mamalia("Gajah");
	    mamalia.info();
	    Bertelur bertelur = new Bertelur("Ayam");
	    bertelur.info();

		do {
			System.out.println("==[DERET HITUNG]==");
			System.out.println("1. Aritmatika \n" +
					"2. Geometri \n" +
					"3. Exit");
			System.out.print("Masukan Pilihan : ");
			int pilihan = input.nextInt();

			switch (pilihan){
				case 1 : {
					System.out.print("Masukan banyak deret = ");
					int deret = input.nextInt();
					System.out.print("Masukan angka awal = ");
					int awal = input.nextInt();
					System.out.print("Masukan jarak bilangn = ");
					int jarak = input.nextInt();
					Aritmatika aritmatika = new Aritmatika(deret,awal,jarak);
					System.out.println("Deret = "+aritmatika.deret());
					aritmatika.barisan();
				}
				break;
				case 2 :{
					System.out.print("Masukan banyak deret = ");
					int banyak = input.nextInt();
					System.out.print("Masukan angka awal = ");
					int awal = input.nextInt();
					System.out.print("Masukan rasio bilangn = ");
					int rasio = input.nextInt();
					Geometri geometri = new Geometri(banyak,awal,rasio);
					System.out.println("Deret "+geometri.deret());
					geometri.barisan();
				}
				break;
				case 3:{
					System.out.println("__Exit__");
					System.exit(0);
				}

			}
		}while (true);


    }
}
