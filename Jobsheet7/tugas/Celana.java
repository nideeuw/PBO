public class Celana extends Pakaian{
    String jenisCelana;
    int panjang;

    // Constructor tanpa parameter
    public Celana() {

    }

    // Constructor dengan parameter
    public Celana(String merek, String ukuran, String warna, String bahan, int harga, String jenisCelana, int panjang) {
        super(merek, ukuran, warna, bahan, harga); // Memanggil constructor superclass
        this.jenisCelana = jenisCelana;
        this.panjang = panjang;
    }

    public void gulungUjung() {
        System.out.println("Ujung celana digulung.");
    }

    public void ubahPanjang(int newPanjang) {
        this.panjang = newPanjang;
        System.out.println("Panjang celana telah diubah menjadi: " + newPanjang);
    }

    // Overriding method infoPakaian dari superclass
    @Override
    public void infoPakaian() {
        super.infoPakaian();
        System.out.println("Jenis Celana: " + jenisCelana);
        System.out.println("Panjang     : " + panjang + " cm");
    }
}