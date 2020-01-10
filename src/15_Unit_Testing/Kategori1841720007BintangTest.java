package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Kategori1841720007BintangTest extends TestCase {

    Kategori1841720007Bintang instance;

    public Kategori1841720007BintangTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720007Bintang("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchBintang method, of class Kategori1841720007Bintang.
     */
    @Test
    public void testSearchBintang() {
        System.out.println("save test");
        this.instance.saveBintang();
        ArrayList<Kategori1841720007Bintang> expResult = instance.getByNamaAndKeteranganBintang(instance.getNamaBintang(), instance.getKeteranganBintang());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveBintang method, of class Kategori1841720007Bintang.
     */
    @Test
    public void testSaveBintang() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720007Bintang> result = instance.searchBintang(keyword);
        ArrayList<Kategori1841720007Bintang> expResult = instance.getByNamaAndKeteranganBintang(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
