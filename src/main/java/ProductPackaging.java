import java.util.Objects;

public class ProductPackaging {
    protected String name;
    protected int  weightPackaging;
    ProductPackaging(String n , int w) {
        name = n;
        weightPackaging = w;
    }
    ProductPackaging(){
        name = "не записано";
        weightPackaging = -1;
    }
    ProductPackaging(ProductPackaging b){
        name = b.name;
        weightPackaging = b.weightPackaging;
    }

    public String getName() {
        return name;
    }

    public int getWeightPackaging() {
        return weightPackaging;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightPackaging(int weightPackaging) {
        this.weightPackaging = weightPackaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging that = (ProductPackaging) o;
        return weightPackaging == that.weightPackaging && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weightPackaging);
    }

    @Override
    public String toString() {
        return "Название упаковки: " + getName() + "\n" +"Масса упаковки: " + getWeightPackaging() + "\n";
    }
}
