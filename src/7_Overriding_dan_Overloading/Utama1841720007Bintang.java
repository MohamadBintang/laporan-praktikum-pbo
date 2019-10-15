
public class Utama1841720007Bintang {

    public static void main(String[] args) {
        Manager1841720007Bintang man[] = new Manager1841720007Bintang[2];
        Staff1841720007Bintang staff1[] = new Staff1841720007Bintang[2];
        Staff1841720007Bintang staff2[] = new Staff1841720007Bintang[3];

        //pembuatan manager
        man[0] = new Manager1841720007Bintang();
        man[0].setNamaBintang("Tedjo");
        man[0].setNipBintang("101");
        man[0].setGolonganBintang("1");
        man[0].setTunjanganBintang(5000000);
        man[0].setBagianBintang("Administrasi");

        man[1] = new Manager1841720007Bintang();
        man[1].setNamaBintang("Atika");
        man[1].setNipBintang("102");
        man[1].setGolonganBintang("1");
        man[1].setTunjanganBintang(2500000);
        man[1].setBagianBintang("Pemasaran");

        staff1[0] = new Staff1841720007Bintang();
        staff1[0].setNamaBintang("Usman");
        staff1[0].setNipBintang("0003");
        staff1[0].setGolonganBintang("2");
        staff1[0].setLemburBintang(10);
        staff1[0].setGajiLemburBintang(10000);

        staff1[1] = new Staff1841720007Bintang();
        staff1[1].setNamaBintang("Anugrah");
        staff1[1].setNipBintang("0005");
        staff1[1].setGolonganBintang("2");
        staff1[1].setLemburBintang(10);
        staff1[1].setGajiLemburBintang(55000);
        man[0].setStBintang(staff1);

        staff2[0] = new Staff1841720007Bintang();
        staff2[0].setNamaBintang("Hendra");
        staff2[0].setNipBintang("0004");
        staff2[0].setGolonganBintang("3");
        staff2[0].setLemburBintang(15);
        staff2[0].setGajiLemburBintang(5500);

        staff2[1] = new Staff1841720007Bintang();
        staff2[1].setNamaBintang("Arie");
        staff2[1].setNipBintang("0006");
        staff2[1].setGolonganBintang("4");
        staff2[1].setLemburBintang(5);
        staff2[1].setGajiLemburBintang(100000);

        staff2[2] = new Staff1841720007Bintang();
        staff2[2].setNamaBintang("Mentari");
        staff2[2].setNipBintang("0007");
        staff2[2].setGolonganBintang("3");
        staff2[2].setLemburBintang(6);
        staff2[2].setGajiLemburBintang(20000);
        man[1].setStBintang(staff2);

        //cetak informasi dari manager + staffnya
        man[0].lihatInfoBintang();
        man[1].lihatInfoBintang();

    }
}
