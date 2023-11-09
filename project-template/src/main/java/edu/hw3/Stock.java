package edu.hw3;

import org.jetbrains.annotations.NotNull;
import java.util.Comparator;
import java.util.Objects;

public class Stock implements Comparable<Stock> {
    public String name;
    public double purchasePrice;

    public Stock(String name, double purchasePrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
    }

    @Override
    public int compareTo(@NotNull Stock o) {
        if(this.equals(o)){
            return 0;
        }
        return (this.purchasePrice > o.purchasePrice) ? -1: 1;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.purchasePrice, purchasePrice) == 0 && Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, purchasePrice);
    }

    @Override public String toString() {
        return "Stock{" +
            "name='" + name + '\'' +
            ", purchasePrice=" + purchasePrice +
            '}';
    }
}
