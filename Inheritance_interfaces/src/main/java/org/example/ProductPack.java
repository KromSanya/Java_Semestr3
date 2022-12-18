package org.example;
import java.util.Objects;
public class ProductPack {
    private final String namepack;
    private double weight;

    public ProductPack(String namepack, double weight) {
        if (Double.compare(weight, 0.0) == -1) throw new IllegalArgumentException("Negative weight!");
        if (namepack == null) throw new IllegalArgumentException();
        this.namepack = namepack;
        this.weight = weight;
    }

    public String getNamepack() {
        return namepack;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Упаковка %s с весом %f", namepack, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPack)) return false;
        ProductPack that = (ProductPack) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getNamepack().equals(that.getNamepack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNamepack(), getWeight());
    }
}
