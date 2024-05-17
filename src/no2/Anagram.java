package no2;

import java.util.Arrays;
public class Anagram {

    public boolean checkAnagrams (String kata1, String kata2) {
        //Menghapus spasi dan karakter lain yang tidak penting
        kata1 = kata1.replaceAll("[^a-zA-Z]", "");
        kata2 = kata2.replaceAll("[^a-zA-Z]", "");

        //Mengubah huruf menjadi huruf kecil untuk memudahkan pengecekan
        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        //Mengubah sebuah kata menjadi array of charachter
        char[] charKata1 = kata1.toCharArray();
        char[] charKata2 = kata2.toCharArray();

        //Untuk mengurutkan array of character
        Arrays.sort(charKata1);
        Arrays.sort(charKata2);

        //Bandingkan 2 kata untuk di cek apakah dia anagram atau tidak
        return Arrays.equals(charKata1, charKata2);
    }
}
