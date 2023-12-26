import junit.framework.TestCase;

public class PackedWeightGoodsTest extends TestCase {

    public void testNetMass() {
        ProductPackaging a = new ProductPackaging("A",12);
        WeightGoods prod1 = new WeightGoods("Лапша","Сухая");
        PackedWeightGoods one = new PackedWeightGoods(a,prod1,3);
        assertEquals(3,one.netMass());
    }

    public void testGrossMass() {
        ProductPackaging a = new ProductPackaging("A",12);
        WeightGoods prod1 = new WeightGoods("Лапша","Сухая");
        PackedWeightGoods one = new PackedWeightGoods(a,prod1,15);
        assertEquals(27,one.grossMass());
    }
    public void testToString() {
        ProductPackaging a = new ProductPackaging("A",12);
        WeightGoods prod1 = new WeightGoods("Лапша","Сухая");
        PackedWeightGoods one = new PackedWeightGoods(a,prod1,3);
        assertEquals("Название упаковки: A\nМасса упаковки: 12\nНазвание товара: Лапша\nОписание товара: Сухая\nМасса кг: 3\n", one.toString());
    }
}