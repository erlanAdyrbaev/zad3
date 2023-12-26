import java.util.Objects;

public class PieceGoods extends Product{
    protected int  weight;
    PieceGoods(String n,  String d, int w){
        super(n,d);
        weight = w;
    }
    PieceGoods(){
        super();
        weight = -1;
    }
    PieceGoods(PieceGoods p){
        super(p);
        weight = p.weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceGoods that = (PieceGoods) o;
        return weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Название товара: " + getName() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Описание товара: " + getDescription() + "\n";
    }
}

