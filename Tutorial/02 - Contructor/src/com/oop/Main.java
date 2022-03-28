package com.oop;

class Polos {
    String dataString;
    int dataInteger;
}

// class contructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
    // ! constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah kostruktor");
    // }

    // ! constructor dengan parameter
    Mahasiswa(String inputNama){
        nama = inputNama;
    }
}

public class Main{
    public static void main(String[] args) throws Exception {
        
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;
        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
        
        // !tanpa constructor
        // Mahasiswa mhs1 = new Mahasiswa();

        // ! dengan constructor
        Mahasiswa mhs2 = new Mahasiswa("idham");
        Mahasiswa mhs3 = new Mahasiswa("adi");
        System.out.println(mhs2.nama);
        System.out.println(mhs3.nama);

        


        
    }
}