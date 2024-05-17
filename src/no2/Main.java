package no2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //scanner digunakan agar bisa menerima inputan dari user
        Scanner input = new Scanner(System.in);

        Anagram checker= new Anagram();

        //untuk menerima inputan kata 1
        System.out.println("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        //untuk menerima inputan kata 2
        System.out.println("Masukkan kata kedua: ");
        String kata2 = input.nextLine();

        //untuk cek apakah kata kata yg di input termasuk anagram
        boolean isAnagram = checker.checkAnagrams(kata1, kata2);

        System.out.println("Kata 1: " + kata1);
        System.out.println("Kata 2: " + kata2);
        System.out.println("Apakah anagram? " + isAnagram);
    }
}
