
public class Main1841720007Bintang {
    public static void main(String[] args) {
        WalkingZombie1841720007Bintang wz = new WalkingZombie1841720007Bintang(100,1);
        JumpingZombie1841720007Bintang jz = new JumpingZombie1841720007Bintang(100,2);
        Barrier1841720007Bintang b = new Barrier1841720007Bintang (100);
        Plant1841720007Bintang p = new Plant1841720007Bintang();
        System.out.println(""+wz.getZombieInfoBintang());
        System.out.println(""+jz.getZombieInfoBintang());
        System.out.println(""+b.getBarrierInfoBintang());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoBintang());
        System.out.println(""+jz.getZombieInfoBintang());
        System.out.println(""+b.getBarrierInfoBintang());
    } 
}
