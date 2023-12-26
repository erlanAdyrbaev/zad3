import junit.framework.TestCase;

public class ConsignmentTest extends TestCase {

    public void testGrossMassConsignment() {
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        PieceGoods lamp = new PieceGoods("лампа настольная","светит ярко", 8);
        PieceGoods mirror = new PieceGoods("зеркало","большое",15);
        WeightGoods cereal = new WeightGoods("крупа","пшеница");
        WeightGoods salt  = new WeightGoods("соль", "морская");
        WeightGoods flour = new WeightGoods("мукка", "высший сорт");

        ProductPackaging wrapper  = new ProductPackaging("пленка", 1);
        ProductPackaging wrapper2  = new ProductPackaging("картонная коробка", 3);
        ProductPackaging wrapper3  = new ProductPackaging("деревянная коробка", 4);

        PackagedPieceGoods one = new PackagedPieceGoods(wrapper,pencil, 2);
        PackagedPieceGoods two = new PackagedPieceGoods(wrapper2,lamp, 4);
        PackagedPieceGoods three = new PackagedPieceGoods(wrapper3, mirror, 6);

        PackedWeightGoods four = new PackedWeightGoods(wrapper,cereal,10);
        PackedWeightGoods five = new PackedWeightGoods(wrapper2,salt,30);
        PackedWeightGoods six = new PackedWeightGoods(wrapper3,flour, 51);
        Consignment cargo = new Consignment("вещи для дома", one,two,three);
        assertEquals(136 , cargo.grossMassConsignment());
        Consignment cargoTwo = new Consignment("вещи для дома и для еды", one, two, five,three, four, six);
        assertEquals(235, cargoTwo.grossMassConsignment());
    }
    public void testequals(){
        PieceGoods pencil = new PieceGoods("карандаш", "пишет хорошо", 3);
        PieceGoods lamp = new PieceGoods("лампа настольная","светит ярко", 8);
        PieceGoods mirror = new PieceGoods("зеркало","большое",15);
        WeightGoods cereal = new WeightGoods("крупа","пшеница");
        WeightGoods salt  = new WeightGoods("соль", "морская");
        WeightGoods flour = new WeightGoods("мукка", "высший сорт");

        ProductPackaging wrapper  = new ProductPackaging("пленка", 1);
        ProductPackaging wrapper2  = new ProductPackaging("картонная коробка", 3);
        ProductPackaging wrapper3  = new ProductPackaging("деревянная коробка", 4);

        PackagedPieceGoods one = new PackagedPieceGoods(wrapper,pencil, 2);
        PackagedPieceGoods two = new PackagedPieceGoods(wrapper2,lamp, 4);
        PackagedPieceGoods three = new PackagedPieceGoods(wrapper3, mirror, 6);

        PackedWeightGoods four= new PackedWeightGoods(wrapper,cereal,10);
        PackedWeightGoods five = new PackedWeightGoods(wrapper2,salt,30);
        PackedWeightGoods six = new PackedWeightGoods(wrapper3,flour, 51);
        Consignment cargo = new Consignment("вещи для дома", one,two,three);
        Consignment cargoTwo = new Consignment("вещи для дома и для еды", one, two, five,three, four, six);
        Consignment cargoThree = new Consignment("вещи для дома", one,two,three);

        assertFalse(cargo.equals(cargoTwo));
        assertTrue(cargo.equals(cargoThree));

    }

    public void testToString(){
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

        assertEquals("Описание партии: вещи для дома\n" +
                "Наборы:\n" +
                "[Название упаковки: пленка\n" +
                "Масса упаковки: 1\n" +
                "Название товара: карандаш\n" +
                "Вес = 3\n" +
                "Описание товара: пишет хорошо\n" +
                "кол-во ед.: 2\n" +
                ", Название упаковки: картонная коробка\n" +
                "Масса упаковки: 3\n" +
                "Название товара: лампа настольная\n" +
                "Вес = 8\n" +
                "Описание товара: светит ярко\n" +
                "кол-во ед.: 4\n" +
                ", Название упаковки: деревянная коробка\n" +
                "Масса упаковки: 4\n" +
                "Название товара: зеркало\n" +
                "Вес = 15\n" +
                "Описание товара: большое\n" +
                "кол-во ед.: 6\n]",cargo.toString());
    }
}