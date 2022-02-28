package com.javaprogram;

public class Tugas2Kalkulator {
	
	int bil1;
	int bil2;
	int hasil;
	
	public int getBil1() {
		return bil1;
	}
	
	public void setBil1(int bil1) {
		this.bil1 = bil1;
	}
	
	public int getBil2() {
		return bil2;
	}
	
	public void setBil2(int bil2) {
		this.bil2 = bil2;
	}
	
	public int getHasil() {
		return hasil;
	}
	
	public void hitungPenjumlahan() {
		hasil = bil1 + bil2;
	}
	
	public void hitungPengurangan() {
		hasil = bil1 - bil2;
	}
	
	public void hitungPerkalian() {
		hasil = bil1 * bil2;
	}
	
	public void hitungPembagian() {
		hasil = bil1 / bil2;
	}
	
}
