import junit.framework.TestCase;

public class GoodsServiceTest extends TestCase {

    public void testCountByFilter() {
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        PieceGoods lamp = new PieceGoods("лампа настольная","светит ярко", 8);
        PieceGoods mirror = new PieceGoods("зеркало","большое",15);

        ProductPackaging wrapper  = new ProductPackaging("пленка", 1);
        ProductPackaging wrapper2  = new ProductPackaging("картонная коробка", 3);
        ProductPackaging wrapper3  = new ProductPackaging("деревянная коробка", 4);



        PackagedPieceGoods one = new PackagedPieceGoods(wrapper,pencil, 2);
        PackagedPieceGoods two = new PackagedPieceGoods(wrapper2,lamp, 4);
        PackagedPieceGoods three = new PackagedPieceGoods(wrapper3, mirror, 6);

        Consignment cargo = new Consignment("вещи для дома", one,two,three);
        GoodsService serv = new GoodsService();
        BeginStringFilter filter = new BeginStringFilter("п");
        assertEquals(0, serv.countByFilter(cargo, filter));

    }
}