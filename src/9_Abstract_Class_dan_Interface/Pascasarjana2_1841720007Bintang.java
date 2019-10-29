
public class Pascasarjana2_1841720007Bintang extends Mahasiswa1841720007Bintang implements ICumlaude1841720007Bintang,IBerprestasi1841720007Bintang{
    public Pascasarjana2_1841720007Bintang(String nama) {
        super(nama);
    }
    
    @Override
    public void menjuaraiKompetisiBintang() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiahBintang() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    } 

    @Override
    public void lulusBintang() {
        super.lulusBintang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiBintang() {
        super.meraihIPKTinggiBintang();//To change body of generated methods, choose Tools | Templates.
    }   
}