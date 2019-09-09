
public class Penyewaan {

    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;
    public int total;

    public void setId(int newId) {
        id = newId;
    }

    public void setNamaMember(String newNamaMember) {
        namaMember = newNamaMember;
    }

    public void setNamaGame(String newNamaGame) {
        namaGame = newNamaGame;
    }

    public void setLamaSewa(int newLamaSewa) {
        lamaSewa = newLamaSewa;
    }

    public int hargaTotal() {
        total = lamaSewa * harga;
        return total;
    }

    public void tampilData() {
        System.out.println("");
        System.out.println("Id Sewa\t : " + id);
        System.out.println("Nama Member\t : " + namaMember);
        System.out.println("Nama Game\t : " + namaGame);
        System.out.println("Harga Perhari\t : " + harga);
        System.out.println("Lama Sewa\t : " + lamaSewa);
        System.out.println("Total Pembayaran\t : " + total);
    }
}
