package percobaan4;

import java.util.ArrayList;


public class InputData1841720007Bintang
{   
    ArrayList<Mahasiswa1841720007Bintang> ListMahasiswa;

    public InputData1841720007Bintang() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataBintang (String mNim, String mNama, String mAlamat)
    {
        Mahasiswa1841720007Bintang mhs = new Mahasiswa1841720007Bintang(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720007Bintang> getDataBintang()
    {
        return ListMahasiswa;
    }
}
