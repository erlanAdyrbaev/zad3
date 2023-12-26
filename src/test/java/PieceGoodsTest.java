import junit.framework.TestCase;

public class PieceGoodsTest extends TestCase {

    public void testTestEquals() {
        PieceGoods a = new PieceGoods("карандаш","черный",12);
        PieceGoods b = new PieceGoods("карандаш","черный",12);
        PieceGoods c = new PieceGoods("карандаш","черный",13);

        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
    }

    public void testTestToString() {
        PieceGoods a = new PieceGoods("карандаш","черный",10);
        PieceGoods b = new PieceGoods("ручка","синяя",8);
        System.out.println(a.description);

        assertEquals("Название товара: карандаш\nВес = 10\nОписание товара: черный\n",a.toString());
        assertEquals("Название товара: ручка\nВес = 8\nОписание товара: синяя\n",b.toString());

    }
}