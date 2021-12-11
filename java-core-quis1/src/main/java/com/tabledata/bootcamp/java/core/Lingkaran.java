package com.tabledata.bootcamp.java.core;

public class Lingkaran {
    public static void main(String[] args) {
        double jariJari = 15;
        double diameter = jariJari * 2;
        double keliling = diameter * Math.PI;
        System.out.println(
            String.format(
                "Nilai PI %.2f, maka kelilingnya adalah %.2f",
                Math.PI,
                keliling
            )
        );
    }
}
