package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Anggota1841720007BintangTest extends TestCase {

    Anggota1841720007Bintang instance;

    public Anggota1841720007BintangTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720007Bintang("Bintang", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchBintang method, of class Anggota1841720007Bintang.
     */
    @Test
    public void testSearchBintang() {
        System.out.println("save test");
        this.instance.saveBintang();
        ArrayList<Anggota1841720007Bintang> expResult = instance.getByNamaAndAlamatAndTeleponBintang(instance.getNamaBintang(), instance.getAlamatBintang(), instance.getTeleponBintang());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveBintang method, of class Anggota1841720007Bintang.
     */
    @Test
    public void testSaveBintang() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720007Bintang> result = instance.searchBintang(keyword);
        ArrayList<Anggota1841720007Bintang> expResult = instance.getByNamaAndAlamatAndTeleponBintang(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
