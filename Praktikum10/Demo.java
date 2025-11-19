import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai> daftaPegawai = new ArrayList<Pegawai>();

        daftaPegawai.add(dosen1);
        daftaPegawai.add(dosen2);
        daftaPegawai.add(tendik1);
        daftaPegawai.add(tendik2);

        // System.out.println("Jumlah Pegawai: " + daftaPegawai.size());

        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // System.out.println(dosen1.nidn);
        dosen1.mengajar();

        Pegawai pegawai1 = dosen1;

        // System.out.println(pegawai1.nip);
        //                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn);
        // pegawai1.mengajar();
        // pegawai1.displayInfo();

        // TenagaKependidikan test = (TenagaKependidikan) pegawai1;

        Dosen newDosen = (Dosen) pegawai1;

        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        newDosen.mengajar();

        train(dosen1);
        train(tendik1);

        System.out.println("Percobaan Downcasting");
        Pegawai pegawai2 = new Pegawai("20000101", "Budi, S.Pd.");
        Dosen dosen3 = (Dosen) pegawai2;

    }

    public static void train(Pegawai pegawai) {
        // System.out.println("Memberikan pelatihan untuk pegawai");
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        // hanya test
        // System.out.println(pegawai.nidn);
        // System.out.println(pegawai.kategori);
        // pegawai.mengajar();

        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }

}