package com.tabledata.bootcamp.java.core;

public class PersegiPanjang {
    
    public static Integer panjang, tinggi;
    public static void main(String[] args) {
        panjang = 10;
        tinggi = 5;
        Integer luas = panjang * tinggi;

        System.out.println(
            String.format(
                "Tinggi %scm, dan Panjang %scm. Maka luas persegi panjang adalah %scm",
                tinggi,
                panjang,
                luas
            )
        );
    }
    
}
