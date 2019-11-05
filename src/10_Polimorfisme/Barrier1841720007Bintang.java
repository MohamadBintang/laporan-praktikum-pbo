
public class Barrier1841720007Bintang implements Destroyable1841720007Bintang {
    private int strength;
    
    public Barrier1841720007Bintang (int strength){
        this.strength = strength;
    }
    public void setStrengthBintang (int strength){
        this.strength = strength;
    }
    public int getStrengthBintang (){
        return strength;
    } 
    public void destroyBintang(){
        strength -= strength*0.1;
    }  
    public void destroyedBintang(){
        destroyBintang();
    }
    public String getBarrierInfoBintang(){
        return "Barrier Strength = "+strength+"\n";
    }
    
}
