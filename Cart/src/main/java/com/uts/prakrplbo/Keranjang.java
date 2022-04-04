package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<>();

    public void tambahProduk(Buah buah) {
        daftarBuah.add(buah);
        System.out.println(buah + " berhasil ditambahkan ke dalam keranjang!");
    }

    public void hapusProduk(Buah buah) {
        daftarBuah.remove(buah);
        System.out.println(buah + " berhasil dikeluarkan ke dalam keranjang!");
    }

    public void getKeranjang() {
        for (String manggaKu : daftarBuah){
            System.out.println("Mangga [" + Main.formatRupiah(2000) + "] x" + Collections.frequency(daftarBuah, manggaKu));
        }
    }
}
