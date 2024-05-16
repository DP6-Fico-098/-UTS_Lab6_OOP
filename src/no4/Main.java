package no4;

public class Main {
public static void main(String[] args) {
    // menampilkan rumus menghitung jarak (s)
    GLBB glbbJarak = new GLBB(10, 5, 2);
    System.out.println("Jarak: " + glbbJarak.getJarak() + " meter");

    // menampilkan rumus menghitung kecepatan akhir (v)
    GLBB glbbKecepatanAkhir = new GLBB(10, 2, 5, true);
    System.out.println("Kecepatan Akhir: " + glbbKecepatanAkhir.getKecepatanAkhir() + " m/s");

    // menampilkan rumus menghitung percepatan (a)
    GLBB glbbPercepatan = new GLBB(10, 20, 5, 0);
    System.out.println("Percepatan: " + glbbPercepatan.getPercepatan() + " m/s^2");

    // ini manggil yang pake overload
    double kecepatanAkhir = glbbJarak.hitungKecepatanAkhir(50, 10, 2);
    System.out.println("Kecepatan Akhir (dengan overload): " + kecepatanAkhir + " m/s");
}
}
