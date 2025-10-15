public class Baju extends Pakaian{
    String jenisBaju, jenisLengan;

    // Constructor tanpa parameter
    public Baju() {

    }

    // Constructor dengan parameter
    public Baju(String merek, String ukuran, String warna, String bahan, int harga, String jenisBaju, String jenisLengan) {
        super(merek, ukuran, warna, bahan, harga); // Memanggil constructor superclass
        this.jenisBaju = jenisBaju;
        this.jenisLengan = jenisLengan;
    }

    public void setelLengan() {
        System.out.println("Lengan baju diatur.");
    }

    public void ubahJenisBaju(String newBaju) {
        this.jenisBaju = newBaju;
        System.out.println("Jenis baju telah diubah menjadi: " + newBaju);
    }

     // Overriding method infoPakaian dari superclass
    @Override
    public void infoPakaian() {
        super.infoPakaian();
        System.out.println("Jenis Baju  : " + jenisBaju);
        System.out.println("Jenis Lengan: " + jenisLengan);
    }
}