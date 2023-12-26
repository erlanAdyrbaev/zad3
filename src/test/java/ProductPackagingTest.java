import junit.framework.TestCase;

public class ProductPackagingTest extends TestCase {

    public void testTestEquals() {
        ProductPackaging a = new ProductPackaging("a", 5);
        ProductPackaging b = new ProductPackaging("b", 4);
        ProductPackaging c = new ProductPackaging("a", 5);

        assertTrue(a.equals(c));
        assertFalse(a.equals(b));
    }

    public void testTestToString() {
        ProductPackaging a = new ProductPackaging("бумага упаковочная", 2);
        assertEquals("ProductPackaging{ name = бумага упаковочная, weightPackaging = 2}", a.toString());
    }
}