package org.example;
import java.util.Objects;
public class PackagedWeightProduct extends WeightProduct {
    private final double weight;
    private final WeightProduct product;
    private final ProductPack productPackaging;

    public PackagedWeightProduct(ProductPack productPackaging, double weight, WeightProduct product) {
        super(product.getName(), product.getDescription());
        if (Double.compare(weight, 0.0) == -1) throw new IllegalArgumentException("Negative weight!");
        this.weight = weight;
        this.product = product;
        this.productPackaging = productPackaging;
    }

    public double getWeight() {
        return weight;
    }

    public Product getProduct() {
        return product;
    }

    public String getNamepack() {
        return productPackaging.getNamepack();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && Objects.equals(productPackaging,
                that.productPackaging) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(productPackaging, getWeight(), getProduct());
    }

    @Override
    public String toString() {
        return String.format("Весовой товар '%s' с упаковкой '%s' (%fкг)",
                product.getName(), productPackaging.getNamepack(), weight);
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + productPackaging.getWeight();
    }
}