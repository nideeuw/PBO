package Praktikum08.tugas;

public abstract class Pakaian {
    // Atribut
    public String merek;
    public String ukuran;
    public String warna;
    public String bahan;
    public int harga;

    // Constructor
    public Pakaian(String merek, String ukuran, String warna, String bahan, int harga) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.warna = warna;
        this.bahan = bahan;
        this.harga = harga;
    }

    // Method
    public void pakai() {
        System.out.println("Pakaian dipakai.");
    }

    public void cuci() {
        System.out.println("Pakaian dicuci.");
    }

    public void lipat() {
        System.out.println("Pakaian dilipat.");
    }

    public void getInfoPakaian() {
        System.out.println("Merek: " + this.merek);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Warna: " + this.warna);
        System.out.println("Bahan: " + this.bahan);
        System.out.println("Harga: " + this.harga);
    }

    // Abstract method
    public abstract void ubahUkuran(String newUkuran);
}