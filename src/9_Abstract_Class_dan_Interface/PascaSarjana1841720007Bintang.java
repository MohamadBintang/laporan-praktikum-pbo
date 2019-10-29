
public class PascaSarjana1841720007Bintang extends Mahasiswa1841720007Bintang implements ICumlaude1841720007Bintang{

    public PascaSarjana1841720007Bintang(String nama) {
        super(nama);
    }

    
    
    @Override
    public void lulusBintang() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiBintang() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
