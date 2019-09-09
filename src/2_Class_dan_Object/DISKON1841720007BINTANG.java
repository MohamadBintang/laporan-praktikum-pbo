public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;
    
    public void setKode(String newKode){
        kode = newKode;
    }
    
    public void setBarang(String newBarang){
        namaBarang = newBarang;
    }
    
    public void setHargaDasar(int newHd){
        hargaDasar = newHd;
    }
    
    public float setDiskon(float newDiskon){
        diskon = newDiskon;
        return diskon;
    }
    
    public int hitungHargaJual(int hargaDasar, float diskon){
        hargaJual = (int) (hargaDasar - (diskon/100*hargaDasar));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("============================");
        System.out.println();
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Awal : "+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Total Bayat : "+hargaJual);
    }
    
}
