package com.rplbo.utsnota;

public class Kalkulator {
    private int bil1, bil2;
    private String op;

    public Kalkulator(BilanganString b1, BilanganString b2, Operator op) {
        this.bil1 = b1.getBilangan();
        this.bil2 = b2.getBilangan();
        this.op = op.getOperatorSimbol();
    }

    public void hitung() {
        if (op.equals("*")){
            double hasil = bil1 * bil2;
            System.out.println("Hasil: " + hasil);
        } else if (op.equals("/")) {
            double hasil = bil1 / bil2;
            System.out.println("Hasil: " + hasil);
        } else if (op.equals("+")) {
            double hasil = bil1 + bil2;
            System.out.println("Hasil: " + hasil);
        } else if (op.equals("-")) {
            double hasil = bil1 - bil2;
            System.out.println("Hasil: " + hasil);
        } else if (op.equals("^")) {
            double hasil = Math.pow(bil1, bil2);
            System.out.println("Hasil: " + hasil);
        }
    }
}
