package org.example;
import java.util.Objects;
public class PackagedWeightProduct extends PackagedProduct {
    private final double weight;
    private final WeightProduct product;


    public PackagedWeightProduct(ProductPack productPackaging, double weight, WeightProduct product) {
        super(product.getName(), product.getDescription(), productPackaging);
        if (weight < 0.0) throw new IllegalArgumentException("Negative weight!");
        this.weight = weight;
        this.product = product;
    }




    public Product getProduct() {
        return product;
    }

    public String getNamepack() {
        return getProductPack().getNamepack();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(product, that.product) && Objects.equals(getProductPack(), that.getProductPack());
    }




    @Override
    public int hashCode() {
        return Objects.hash(getProductPack(), getNetWeight(), getProduct());
    }

    @Override
    public String toString() {
        return String.format("Весовой товар '%s' с упаковкой '%s' (%fкг)",
                product.getName(), getProductPack().getNamepack(), weight);
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + getProductPack().getWeight();
    }
}