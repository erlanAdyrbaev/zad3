import junit.framework.TestCase;
import org.junit.Test;

public class ProductTest extends TestCase {

    @Test
    public void testTestEquals() {
            Product a = new Product("Сахар","Белый");
            Product b = new Product("Сахар","Белый");
            Product c = new Product("Подарок","Сладкий");

            assertTrue(a.equals(b));
            assertFalse(a.equals(c));
    }

    public void testTestHashCode() {
        Product a = new Product("Сахар","Белый");
        Product b = new Product("Сахар","Белый");
        Product c = new Product("Подарок","Сладкий");

        assertTrue(a.hashCode() == b.hashCode()  );
        assertFalse(a.hashCode() == c.hashCode());
    }
    public void testToString(){
        Product a = new Product("Сахар","Белый");
        assertEquals("Название товара: Сахар\nОписание товара: Белый\n",a.toString());
    }

}