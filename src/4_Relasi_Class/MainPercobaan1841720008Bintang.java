
public class MainPercobaan1841720008Bintang {

    public static void main(String []args){
        Processor1841720007Bintang p = new Processor1841720007Bintang("Intel i5", 3);
        Laptop1841720007Bintang l = new Laptop1841720007Bintang("Thinkpad", new Processor1841720007Bintang("Intel i5", 3));
        
        l.infoBintang();
        
        Processor1841720007Bintang p1 = new Processor1841720007Bintang();
        p1.setMerkBintang("Intel i5");
        p1.setCacheBintang(4);
        Laptop1841720007Bintang l1 = new Laptop1841720007Bintang();
        l1.setMerkBintang("Thinkpad");
        l1.setProcBintang(p1);
        l1.infoBintang();
       
       
        
    }
}
