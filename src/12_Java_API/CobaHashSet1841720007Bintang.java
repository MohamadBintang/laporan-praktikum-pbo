package percobaan1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CobaHashSet1841720007Bintang
{
    public static void main(String[] args) 
    {
        Set mSeCity = new HashSet();
        mSeCity.add("Malang");
        mSeCity.add("Banyuwangi");
        mSeCity.add("Jogjakarta");
        mSeCity.add("Batu");
//        set.add("Malang");
        
        System.out.println(mSeCity);
        Iterator<String> mIterator = mSeCity.iterator();
        
        while (mIterator.hasNext()) 
        {
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
