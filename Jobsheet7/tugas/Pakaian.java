public class Pakaian {
    String merek, ukuran, warna, bahan;
    int harga;

    // Constructor tanpa parameter
    public Pakaian() {

    }

    // Constructor dengan parameter
    public Pakaian(String merek, String ukuran, String warna, String bahan, int harga) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.warna = warna;
        this.bahan = bahan;
        this.harga = harga;
    }

    public void pakai() {
        System.out.println("Pakaian dipakai.");
    }

    public void cuci() {
        System.out.println("Pakaian dicuci.");
    }

    public void lipat() {
        System.out.println("Pakaian dilipat.");
    }

    public void infoPakaian() {
        System.out.println("Merek       : " + merek);
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Warna       : " + warna);
        System.out.println("Bahan       : " + bahan);
        System.out.println("Harga       : Rp " + harga);
    }

    public void ubahUkuran(String newUkuran) {
        this.ukuran = newUkuran;
        System.out.println("Ukuran pakaian telah diubah menjadi: " + newUkuran);
    }
}