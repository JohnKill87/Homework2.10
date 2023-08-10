package pro.sky.onlinestoredemo.Essences;

public class Basket {
    private String name;
    private Integer id;

    public Basket(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
