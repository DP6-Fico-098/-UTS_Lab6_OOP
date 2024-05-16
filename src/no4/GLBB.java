package no4;

public class GLBB {
    private double kecepatanAwal; // V0
    private double kecepatanAkhir; // Vt
    private double percepatan; // a
    private double waktu; // t
    private double jarak; // s

    // Constructor untuk menghitung jarak (s) jika kecepatan awal (v0), waktu (t), dan percepatan (a) diketahui
    public GLBB(double kecepatanAwal, double waktu, double percepatan) {
        this.kecepatanAwal = kecepatanAwal;
        this.waktu = waktu;
        this.percepatan = percepatan;
        this.jarak = hitungJarak();
    }

    // Constructor untuk menghitung kecepatan akhir (v) jika kecepatan awal (v0), percepatan (a), dan waktu (t) diketahui
    public GLBB(double kecepatanAwal, double percepatan, double waktu, boolean isKecepatanAkhir) {
        this.kecepatanAwal = kecepatanAwal;
        this.percepatan = percepatan;
        this.waktu = waktu;
        if (isKecepatanAkhir) {
            this.kecepatanAkhir = hitungKecepatanAkhir();
        }
    }

    // Constructor untuk menghitung percepatan (a) jika kecepatan awal (v0), kecepatan akhir (v), dan waktu (t) diketahui
    public GLBB(double kecepatanAwal, double kecepatanAkhir, double waktu, int dummy) {
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanAkhir = kecepatanAkhir;
        this.waktu = waktu;
        this.percepatan = hitungPercepatan();
    }

    // Method untuk menghitung jarak (s)
    private double hitungJarak() {
        return kecepatanAwal * waktu + 0.5 * percepatan * waktu * waktu;
    }

    // Method untuk menghitung kecepatan akhir (v)
    private double hitungKecepatanAkhir() {
        return kecepatanAwal + percepatan * waktu;
    }

    // Overloaded method untuk menghitung kecepatan akhir (v) dengan jarak
    // atau bisa disebut dengan Persamaan Kecepatan sebagai Fungsi Jarak
    public double hitungKecepatanAkhir(double kecepatanAwal, double jarak, double percepatan) {
        return Math.sqrt(kecepatanAwal * kecepatanAwal + 2 * percepatan * jarak);
    }

    // Method untuk menghitung percepatan (a)
    private double hitungPercepatan() {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }


    // Getter methods
    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public double getPercepatan() {
        return percepatan;
    }

    public double getWaktu() {
        return waktu;
    }

    public double getJarak() {
        return jarak;
    }
}