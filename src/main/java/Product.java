import java.util.Objects;

public class Product {
protected String name;
protected String description;
Product(String n,String d){
    name = n;
    description = d;
}
Product() {
    name = "не записано";
    description = " ";
}
Product(Product s){
    name = s.name;
    description = s.description;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Название товара: " + getName() + "\n" + "Описание товара: " + getDescription() + "\n";
    }
}
