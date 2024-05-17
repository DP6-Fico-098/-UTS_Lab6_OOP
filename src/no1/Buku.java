package no1;

public class Buku {
    //variabel
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // Constructor untuk menginisialisasi objek Buku baru
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method Getter untuk mendapatkan nilai atribut
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method Setter untuk mengatur nilai atribut
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // Method Overriding untuk menampilkan informasi buku dalam format String
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tahun Terbit: " + tahunTerbit;
    }
}
