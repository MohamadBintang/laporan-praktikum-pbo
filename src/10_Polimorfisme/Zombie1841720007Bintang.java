
public abstract class Zombie1841720007Bintang implements Destroyable1841720007Bintang { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfoBintang(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healBintang();    
    @Override    
    public abstract void destroyedBintang(); 
    
}
