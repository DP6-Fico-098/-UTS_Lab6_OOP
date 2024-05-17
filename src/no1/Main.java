package no1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);

        // Input dari user untuk menambahkan buku ke perpustakaan
        System.out.print("Masukkan jumlah buku yang ingin ditambahkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= jumlahBuku; i++) {
            System.out.print("Masukkan judul buku " + i +": " );
            String judul = scanner.nextLine();
            System.out.print("Masukkan penulis buku " + i +": ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan tahun terbit buku " + i +": ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Menggunakan method overloading untuk menambahkan buku ke perpustakaan
            perpustakaan.tambahBuku(judul, penulis, tahunTerbit);
        }

        // Menampilkan koleksi buku di perpustakaan
        System.out.println("Koleksi buku di perpustakaan:");
        perpustakaan.tampilkanKoleksi();
    }
}
