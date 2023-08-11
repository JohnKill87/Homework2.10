package pro.sky.onlinestoredemo.Essences;

import java.util.Objects;

public class Basket {
    private final Integer id;

    public Basket(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(id, basket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
