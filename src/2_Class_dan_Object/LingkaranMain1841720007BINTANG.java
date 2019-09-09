
import java.util.Scanner;

public class LingkaranMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lingkaran lingkaran1 = new Lingkaran();

        System.out.println("Masukkan Jari - Jari : ");
        lingkaran1.jariJari = sc.nextDouble();
        lingkaran1.setLuas();
        lingkaran1.setKeliling();
        lingkaran1.tampilData();
    }

}
