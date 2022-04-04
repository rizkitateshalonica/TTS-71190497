package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String a) {
        String angka = a.toLowerCase();
        if (angka.equals("satu")) {
            bilangan = 1;
        } else if (angka.equals("dua")) {
            bilangan = 2;
        } else if (angka.equals("tiga")) {
            bilangan = 3;
        } else if (angka.equals("empat")) {
            bilangan = 4;
        } else if (angka.equals("lima")) {
            bilangan = 5;
        } else if (angka.equals("enam")) {
            bilangan = 6;
        } else if (angka.equals("tujuh")) {
            bilangan = 7;
        } else if (angka.equals("delapan")) {
            bilangan = 8;
        } else if (angka.equals("sembilan")) {
            bilangan = 9;
        } else if (angka.equals("sepuluh")) {
            bilangan = 10;
        } else if (angka.equals("sebelas")) {
            bilangan = 11;
        } else if (angka.equals("dua belas")) {
            bilangan = 12;
        } else if (angka.equals("tiga belas")) {
            bilangan = 13;
        } else if (angka.equals("empat belas")) {
            bilangan = 14;
        } else if (angka.equals("lima belas")) {
            bilangan = 15;
        } else if (angka.equals("enam belas")) {
            bilangan = 16;
        } else if (angka.equals("tujuh belas")) {
            bilangan = 17;
        } else if (angka.equals("delapan belas")) {
            bilangan = 18;
        } else if (angka.equals("sembilan belas")) {
            bilangan = 19;
        } else if (angka.equals("dua puluh")) {
            bilangan = 20;
        }
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit() {
        boolean hasil = true;
        if (bilangan >= 10) {
            hasil =  true;
        }
        else if (bilangan <= 9) {
            hasil =  false;
        }
        return hasil;
    }

    public boolean apakahLebihDari10() {
        boolean hasil = true;
        if (bilangan > 10) {
            hasil = true;
        }
        else if (bilangan <= 10) {
            hasil = false;
        }
        return hasil;
    }
}
