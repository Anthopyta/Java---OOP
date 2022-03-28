package com.MahasiswaDemo;

public class Mahasiswa{
    private int nim;
    private String nama;

    public Mahasiswa(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    
    public int getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }

}