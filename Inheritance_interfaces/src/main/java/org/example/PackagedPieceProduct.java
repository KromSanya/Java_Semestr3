package org.example;
import java.util.Objects;
public class PackagedPieceProduct extends PackagedProduct {
    private final int count;
    private final PieceProduct product;

    public PackagedPieceProduct(ProductPack productPackaging, int count, PieceProduct product) {
        super(product.getName(), product.getDescription(), productPackaging);
        if (count < 0) throw new IllegalArgumentException("Negative count!");
        this.count = count;
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedPieceProduct that)) return false;
        return getCount() == that.getCount() && Objects.equals(getProductPack(),
                that.getProductPack()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPack(), getCount(), getProduct());
    }

    @Override
    public String toString() {
        return String.format("Штучный товар '%s' с упаковкой '%s' (%d штук)",
                product.getName(), getProductPack().getNamepack(), count);
    }

    public double getNetWeight() {
        return count * product.getWeight();
    }

    public double getGrossWeight() {
        return count * product.getWeight() + getProductPack().getWeight();
    }
}