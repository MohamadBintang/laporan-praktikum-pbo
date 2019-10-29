
public class Program2_1841720007Bintang {
    public static void main(String[] args){
        Rektor1841720007Bintang pakRektor = new Rektor1841720007Bintang();
        
        Mahasiswa1841720007Bintang MahasiswaBiasa = new Mahasiswa1841720007Bintang("Charlie");
        Sarjana1841720007Bintang sarjanaCumlaude = new Sarjana1841720007Bintang("Dino");
        PascaSarjana1841720007Bintang masterCumlaude = new PascaSarjana1841720007Bintang("Fani");
        
        MahasiswaBiasa.kuliahDikampusBintang();
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        sarjanaCumlaude.kuliahDikampusBintang();
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        masterCumlaude.kuliahDikampusBintang();
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
    }
}


