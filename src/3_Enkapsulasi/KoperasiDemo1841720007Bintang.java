
public class KoperasiDemo1841720007Bintang {

    public static void main(String[] args) {
        Anggota1841720007Bintang anggota1 = new Anggota1841720007Bintang("Mohamad Bintang", "Tulungagung");
        System.out.println("Simpanan" + anggota1.getNamaBintang() + ": Rp " + anggota1.getSimpananBintang());
        anggota1.setNamaBintang("Mohamad Bintang");
        anggota1.setAlamatBintang("Perumahan Tulungagung Permai C-6");
        anggota1.setorBintang(100000);
        System.out.println("Simpanan" + anggota1.getNamaBintang() + ": Rp " + anggota1.getSimpananBintang());
        anggota1.pinjamBintang(5000);
        System.out.println("Simpanan" + anggota1.getNamaBintang() + ": Rp " + anggota1.getSimpananBintang());
    }
}
