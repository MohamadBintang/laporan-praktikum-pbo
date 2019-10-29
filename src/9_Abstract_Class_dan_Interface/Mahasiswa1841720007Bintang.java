
public class Mahasiswa1841720007Bintang implements ICumlaude1841720007Bintang{
    protected String nama;

    public Mahasiswa1841720007Bintang(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusBintang() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiBintang() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusBintang(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
