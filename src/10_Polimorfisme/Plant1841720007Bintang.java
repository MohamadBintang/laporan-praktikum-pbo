
public class Plant1841720007Bintang {
    public void doDestroy (Destroyable1841720007Bintang d){
        if (d instanceof WalkingZombie1841720007Bintang){
            WalkingZombie1841720007Bintang wz = (WalkingZombie1841720007Bintang) d;
            wz.destroyedBintang();
        }else if (d instanceof JumpingZombie1841720007Bintang){
            JumpingZombie1841720007Bintang jz = (JumpingZombie1841720007Bintang) d;
            jz.destroyedBintang();
        }else if (d instanceof Barrier1841720007Bintang){
            Barrier1841720007Bintang b = (Barrier1841720007Bintang) d;
            b.destroyedBintang();
        }
    }
}
