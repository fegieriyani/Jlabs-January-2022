package com.javaprogram;

import java.util.Scanner;

public class Tugas2Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tugas2Kalkulator kalkulator = new Tugas2Kalkulator();
		try (Scanner input = new Scanner(System.in)) {
			boolean next = true;

			while(next == true) {
				System.out.println("");
				System.out.println("Kalkulator Sederhana");
				System.out.println("=========================");

				System.out.print("Masukkan bilangan pertama : ");
				int bil1 = input.nextInt();
				kalkulator.setBil1(bil1);
				System.out.println("");

				System.out.print("Masukkan bilangan kedua : ");
				int bil2 = input.nextInt();
				kalkulator.setBil2(bil2);
				System.out.println("");

				kalkulator.hitungPenjumlahan();
				System.out.println("Hasil Penjumlahan dari " + bil1 + " + " + bil2 + " = " + kalkulator.getHasil());

				kalkulator.hitungPerkalian();
				System.out.println("Hasil Perkalian dari " + bil1 + " * " + bil2 + " = " + kalkulator.getHasil());

				kalkulator.hitungPembagian();
				System.out.println("Hasil Pembagian dari " + bil1 + " / " + bil2 + " = " + kalkulator.getHasil());

				kalkulator.hitungPengurangan();

				if (kalkulator.getHasil() < 0) {
					throw new ArithmeticException("Sorry! This is error");
				} else {
					System.out.println("Hasil Pengurangan dari " + bil1 + " - " + bil2 + " = " + kalkulator.getHasil());
				}
			}
		}
	}
}


