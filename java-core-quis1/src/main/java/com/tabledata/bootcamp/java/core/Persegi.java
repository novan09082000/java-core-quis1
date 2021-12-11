package com.tabledata.bootcamp.java.core;

/**
 * persegi
 */
public class Persegi {

    public static void main(String[] args) {
        
        double sisi = 50d;
        double luas = (sisi * sisi) / 100;
        System.out.println(
            String.format(
                "Dengan sisi %scm maka luas persegi tersebut adalah %sm",
                (int) sisi,(int)luas)
            );

    }
    

}