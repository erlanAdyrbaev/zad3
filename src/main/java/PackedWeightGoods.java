public class PackedWeightGoods extends PackedGoods{
    protected int  quantityOfWeighGoods;
    protected WeightGoods good;

    PackedWeightGoods(ProductPackaging pp,WeightGoods goods  ,int quantityOfWeighGoods ) {
    super(pp);
    good = new WeightGoods(goods);
    this.quantityOfWeighGoods = quantityOfWeighGoods;
    }
    public int  netMass()
    {
       return quantityOfWeighGoods;
    }
    @Override
    public int grossMass() {
        return quantityOfWeighGoods + super.pack.weightPackaging;
    }

    public String  getName() {
        return good.getName();
    }

    public int getQuantityOfWeighGoods() {
        return quantityOfWeighGoods;
    }

    @Override
    public String toString(){
        return pack.toString() + good.toString() + "Масса кг: " + getQuantityOfWeighGoods()+ "\n";
    }

    public WeightGoods getGood() {
        return good;
    }
    @Override
    public String GetName(){
       return good.getName();
    }
}
