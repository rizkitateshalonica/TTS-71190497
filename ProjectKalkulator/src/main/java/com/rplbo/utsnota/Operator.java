package com.rplbo.utsnota;

import java.util.Locale;

public class Operator {
    String operatorString, operatorSimbol;

    public Operator(String s) {
        String tanda = s.toLowerCase();
        if (tanda.equals("kali")){
            operatorSimbol = "*";
        }
        else if (tanda.equals("bagi")) {
            operatorSimbol = "/";
        }
        else if (tanda.equals("tambah")) {
            operatorSimbol = "+";
        }
        else if (tanda.equals("kurang")) {
            operatorSimbol = "-";
        }
        else if (tanda.equals("pangkat")) {
            operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
