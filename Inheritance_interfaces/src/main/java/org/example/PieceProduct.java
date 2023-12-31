package org.example;

import java.util.Objects;

public class PieceProduct extends Product {
    private final double weight;

    public PieceProduct(String name, String description, double weight) {
        super(name, description);
        if (weight < 0.0) throw new IllegalArgumentException();
        this.weight = weight;
    }

    public PieceProduct(PieceProduct product) {
        super(product);
        weight = product.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceProduct that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }

    @Override
    public String toString() {
        return String.format("Товар %s %fкг (%s)", getName(), getWeight(), getDescription());
    }

    public double getWeight() {
        return weight;
    }
}