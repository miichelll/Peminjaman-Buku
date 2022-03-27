package com.company;

import org.w3c.dom.ls.LSOutput;

//mahasiswa
class Mahasiswa{
    String nama;
    int npm;
    String jurusan;
    Buku buku;

    //methode
    void meminjamBuku(Buku buku){
        this.buku = buku;
    }

    //constructor mahasiswa
    Mahasiswa(String nama, int npm, String jurusan){
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    void dataMahasiswa(){
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("NPM mahasiswa : " + npm);
        System.out.println("Jurusan mahasiswa : " + jurusan);
        buku.dataPeminjaman();
    }
}

class Buku {
    String namaBuku;
    int nomorBuku;

    //constructor buku
    Buku(String namaBuku, int nomorBuku){
        this.namaBuku = namaBuku;
        this.nomorBuku = nomorBuku;
    }

    //methode buku
    void dataPeminjaman(){
        System.out.println("Nama buku : " + namaBuku);
        System.out.println("Nomor buku : " + nomorBuku);
    }
}





public class Main {

    public static void main(String[] args) {
        Mahasiswa Michel = new Mahasiswa ("Michel", 2015061018, "teknik informatika"
        );
        Buku OOP = new Buku ("Pemrograman Berorientasi Objek", 10035 );
        Michel.meminjamBuku(OOP);
        Michel.dataMahasiswa();

    }
}
