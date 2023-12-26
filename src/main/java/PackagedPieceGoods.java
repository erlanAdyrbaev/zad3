public class PackagedPieceGoods extends PackedGoods{
    protected int quantityOfPieceGoods;
    protected PieceGoods pieceGood;
    PackagedPieceGoods(ProductPackaging pp, PieceGoods pg, int quantity)
    {
        super(pp);
        pieceGood = new PieceGoods(pg);
        quantityOfPieceGoods = quantity;
    }

    public int getQuantityOfPieceGoods() {
        return quantityOfPieceGoods;
    }


    public int netMass(){
        return quantityOfPieceGoods * pieceGood.weight;
    }
    @Override
    public int grossMass(){
        return netMass() + super.pack.weightPackaging;
    }
    @Override
    public String toString() {
        return pack.toString() + pieceGood.toString() +  "кол-во ед.: " + getQuantityOfPieceGoods() + "\n";
    }

    public PieceGoods getPieceGood() {
        return pieceGood;
    }
    @Override
    public String GetName(){
        return pieceGood.getName();
    }
}
