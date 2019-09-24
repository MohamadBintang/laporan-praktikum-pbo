
public class MainPenumpang1841720007Bintang {
    public static void main(String[] args) {
        Penumpang1841720007Bintang p = new Penumpang1841720007Bintang("123123", "Mohamad Bintang");
        Penumpang1841720007Bintang p1 = new Penumpang1841720007Bintang("21313", "Bagong");
        Gerbong1841720007Bintang g = new Gerbong1841720007Bintang("D", 15);
        g.setPenumpang(p, 1);
        g.setPenumpang(p1, 1);
        System.out.println(g.info());
    }
}
