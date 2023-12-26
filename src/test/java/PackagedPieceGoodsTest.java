import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class PackagedPieceGoodsTest extends TestCase {

    public void testNetMass() {
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        PieceGoods lamp = new PieceGoods("лампа настольная","светит ярко", 8);
        PieceGoods mirror = new PieceGoods("зеркало","большое",15);

        ProductPackaging wrapper  = new ProductPackaging("пленка", 1);
        PackagedPieceGoods one = new PackagedPieceGoods(wrapper,pencil, 2);
        PackagedPieceGoods two = new PackagedPieceGoods(wrapper,lamp, 4);
        PackagedPieceGoods three = new PackagedPieceGoods(wrapper, mirror, 6);
        assertEquals(6,one.netMass());
        assertEquals(32,two.netMass());
        assertEquals(90,three.netMass());





    }

    public void testGrossMass() {
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        PieceGoods lamp = new PieceGoods("лампа настольная", "светит ярко", 8);
        PieceGoods mirror = new PieceGoods("зеркало", "большое", 15);

        ProductPackaging wrapper = new ProductPackaging("пленка", 1);
        ProductPackaging wrapper2 = new ProductPackaging("картонная коробка", 3);
        ProductPackaging wrapper3 = new ProductPackaging("деревянная коробка", 4);

        PackagedPieceGoods one = new PackagedPieceGoods(wrapper, pencil, 2);
        PackagedPieceGoods two = new PackagedPieceGoods(wrapper2, lamp, 4);
        PackagedPieceGoods three = new PackagedPieceGoods(wrapper3, mirror, 6);

        assertEquals(7, one.grossMass());
        assertEquals(35, two.grossMass());
        assertEquals(94, three.grossMass());
    }
    public void testToString() {
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        ProductPackaging wrapper = new ProductPackaging("пленка", 1);
        PackagedPieceGoods one = new PackagedPieceGoods(wrapper, pencil, 2);
        assertEquals("Название упаковки: пленка\n" +
                "Масса упаковки: 1\n" +
                "Название товара: карандаш\n" +
                "Вес = 3\n" +
                "Описание товара: пишет хорошо\n" +
                "кол-во ед.: 2\n",one.toString());
    }
}
