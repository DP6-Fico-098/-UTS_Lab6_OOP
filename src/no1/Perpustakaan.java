package no1;

import java.util.ArrayList;
public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();

    // Method untuk menambahkan buku ke dalam koleksi
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    // Method Overloading untuk menambahkan buku dengan detailnya
    public void tambahBuku(String judul, String penulis, int tahunTerbit) {
        Buku buku = new Buku(judul, penulis, tahunTerbit);
        koleksiBuku.add(buku);
    }

    // Method untuk menampilkan semua buku dalam koleksi
    public void tampilkanKoleksi() {
        for (Buku buku : koleksiBuku) {
            System.out.println(buku);
        }
    }
}
