package com.oop;

class Mahasiswa{
    // Data member
    String nama; 
    String nim;

    // constructor
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tapi tanpa parameter
    String getNama() {
        return this.nama;
    }
    String getNIM(){
        return this.nim;
    }

    // method dengan return dan dengan parameter
    String sayHello(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

class Dosen{
    String nama;

    Dosen(String namaDsn){
        this.nama = namaDsn;
    }
}

public class Main{
    public static void main(String[] args) throws Exception{
        Mahasiswa mhs1 = new Mahasiswa("idham", "A11.2020.13092");
        // System.out.println(mhs1.nama);

        //  memanggil method test
        // test();

        //  method show
        mhs1.show();

        //  method setNama
        mhs1.setNama("adi");
        mhs1.show();

        //  method getNama
        System.out.println(mhs1.getNama());
        //  method getNIM
        System.out.println(mhs1.getNIM());

        // method sayHello
        System.out.println(mhs1.sayHello("halo"));


        // class Dosen
        Dosen dsn1 = new Dosen("Ahmad");
        System.out.println(dsn1.nama);
        

    }

    // ? method test
    static void test(){
        System.out.println("ini adalah method test");
    }
}