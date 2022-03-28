package com.class_object;

class Mahasiswa {
    // class
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class Main{
    public static void main(String[] args){
        
        // instanisiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "idham";
        mahasiswa1.NIM = "A11.2020.13092";
        mahasiswa1.jurusan = "teknik informatika";
        mahasiswa1.IPK = 3.8;
        mahasiswa1.umur = 22;
        
        // output
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }
}