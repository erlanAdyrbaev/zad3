import junit.framework.TestCase;
import org.junit.Test;

public class WeightGoodsTest extends TestCase {
    @Test
    public void testTestEquals() {
        WeightGoods a = new WeightGoods("Сахар","Белый");
        WeightGoods b = new WeightGoods("Сахар","Белый");
        WeightGoods c = new WeightGoods("Мука","Высший сорт");

        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
    }

    public void testTestHashCode() {
        WeightGoods a = new WeightGoods("Сахар","Белый");
        WeightGoods b = new WeightGoods("Сахар","Белый");
        WeightGoods c = new WeightGoods("Мука","Высший сорт");

        assertTrue(a.hashCode() == b.hashCode()  );
        assertFalse(a.hashCode() == c.hashCode());
    }
    public void testToString(){
        WeightGoods a = new WeightGoods("Сахар","Белый");
        assertEquals("Название товара: Сахар\nОписание товара: Белый\n",a.toString());
    }

}