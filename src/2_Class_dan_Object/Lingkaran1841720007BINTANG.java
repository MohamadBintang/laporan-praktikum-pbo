import java.util.Scanner;
public class Lingkaran {
    public double jariJari;
    public double phi = 3.14;
    public double luas;
    public double keliling;
    
    Scanner sc = new Scanner(System.in);
    
    public double setJariJari(){
        return jariJari;
    }
    
    public double setLuas(){
        luas = phi * jariJari * jariJari;
        return luas;
    }
    
    public double setKeliling(){
        keliling = 2 * phi * jariJari;
        return keliling;
    }
    
    public void tampilData(){
        System.out.println("Jari - Jari Lingkaran : " +jariJari);
        System.out.println("Luas Lingkaran : "+luas);
        System.out.println("Keliling Lingkaran : "+keliling);
    }
}
