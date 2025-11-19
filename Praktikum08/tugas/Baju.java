package Praktikum08.tugas;

public class Baju extends Pakaian {
    // Atribut
    public String jenisBaju;
    public String jenisLengan;

    // Constructor
    public Baju(String merek, String ukuran, String warna, String bahan, int harga, String jenisBaju, String jenisLengan) {
        // Memanggil constructor superclass
        super(merek, ukuran, warna, bahan, harga);
        this.jenisBaju = jenisBaju;
        this.jenisLengan = jenisLengan;
    }

    // Method override
    @Override
    public void ubahUkuran(String newUkuran) {
        this.ukuran = newUkuran;
        System.out.println("Ukuran baju diubah menjadi: " + newUkuran);
    }

    public void setelLengan() {
        System.out.println("Lengan baju disetel.");
    }

    @Override
    public void getInfoPakaian() {
        // Memanggil method getInfoPakaian superclass
        super.getInfoPakaian();
        System.out.println("Jenis Baju: " + this.jenisBaju);
        System.out.println("Jenis Lengan: " + this.jenisLengan);
    }
}