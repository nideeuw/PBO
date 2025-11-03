package Praktikum08.tugas;

public class Celana extends Pakaian {
    // Atribut
    public String jenisCelana;
    public int panjang;

    // Constructor
    public Celana(String merek, String ukuran, String warna, String bahan, int harga, String jenisCelana, int panjang) {
        // Memanggil constructor superclass
        super(merek, ukuran, warna, bahan, harga);
        this.jenisCelana = jenisCelana;
        this.panjang = panjang;
    }

    // Method override
    @Override
    public void ubahUkuran(String newUkuran) {
        this.ukuran = newUkuran;
        System.out.println("Ukuran celana diubah menjadi: " + newUkuran);
    }

    public void gulungUjung() {
        System.out.println("Ujung celana digulung.");
    }

    @Override
    public void getInfoPakaian() {
        // Memanggil method getInfoPakaian superclass
        super.getInfoPakaian();
        System.out.println("Jenis Celana: " + this.jenisCelana);
        System.out.println("Panjang: " + this.panjang + " cm");
    }
}