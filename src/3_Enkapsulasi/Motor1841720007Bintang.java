
public class Motor1841720007Bintang {

    private int kecepatan = 100;
    private boolean kontakOn = false;

    public void nyalakanMesinBintang() {
        kontakOn = true;
    }

    public void matikanMesinBintang() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatanBintang() {
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatanBintang() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatusBintang() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan" + kecepatan + "\n");
    }
}
