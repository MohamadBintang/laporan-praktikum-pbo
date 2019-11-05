
public class JumpingZombie1841720007Bintang extends Zombie1841720007Bintang {
    public JumpingZombie1841720007Bintang (int health, int level){
        this.level = level;
        this.health = health;
    }
    public void healBintang(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    public void destroyedBintang(){
        health -= health*0.093;
    }
    public String getZombieInfoBintang(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoBintang()+"\n";
        return info;
    } 
}
