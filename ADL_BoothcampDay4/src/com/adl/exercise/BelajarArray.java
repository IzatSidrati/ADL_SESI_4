package com.adl.exercise;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BelajarArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BelajarArray blj = new BelajarArray();
		//blj.inputbarang();
		//blj.dsraray();
		blj.latihan();
	}
		public void dsraray () {
			
		int [] myarray;
		//Deklarasi variable hanya size array nya saja tanpa isi
		myarray = new int [10];
		//deklasrasi dengan isi dari array
		int myarray1 [] = {3,4,2,5,1,6,7,8,9};
		myarray[0] = 1;
		myarray[4] = 1;
		System.out.println("\n \nprint array secara manual");
		for (int i=0; i< myarray.length;i++) {
			System.out.println(myarray[i]+ " ");
		}
		System.out.println();
		for (int angka : myarray1) {
			System.out.print(angka+" ");
		}
		System.out.println("=== menggunakan array objek===");
		System.out.println(Arrays.toString(myarray));
		System.out.println(Arrays.toString(myarray1));
		
		
		System.out.println("=======Adrress sebelum passing reference=====");
		System.out.println(myarray);
		System.out.println(myarray1);
		myarray=myarray1;
		System.out.println("======Address sebelum passing reference=====");
		System.out.println(myarray);
		System.out.println(myarray1);
	}	

		public void inputbarang() {
			Scanner scan = new Scanner (System.in);
			System.out.print("Masukan jumlah barang: ");
			int jml = scan.nextInt();
			String [] arr = new String[jml];
			System.out.println("Masukan nama barang: ");
			for (int i=0;i<arr.length;i++) {
				arr [i]= scan.next();
			}
			//System.out.println("List Barang: ");
			//for (int i=0;i<arr.length;i++) {
			//	System.out.println(i+1+ ". "+arr[i]);
			//}
			//atau bisa menggunakan ini
			for (String namaBarang : arr) {
				System.out.println("List Barang anda: ");
				System.out.println(namaBarang);
			}
			
		
			
		}
		public void latihan () {
			Scanner scan = new Scanner (System.in);
			System.out.println("Masukan Jumlah maksimal inputan: ");
			int jml = scan.nextInt();
			String [] namaMahasiswa = new String [jml];
			int [] nilaiMahasiswa = new int [jml];
			for (int i=0;i<jml;i++) {
			System.out.print("Masukan Nama Mahasiswa ke-"+i+"= ");
			namaMahasiswa[i]= scan.nextLine();
			System.out.println("Masukan Nilai Mahasiswa ke-"+i+"= ");
			nilaiMahasiswa[i]=scan.nextInt();
		}
			for (int i=0;i<jml;i++) {
				System.out.println("Nama ");
			}
	

}
