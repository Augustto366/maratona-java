package javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id not can null");
        Objects.requireNonNull(name, "name not can null");
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Manga [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Manga arg0) {
        // Long é um wrapper, ou seja, já tem CompareTo internamente
        /*if (this.id < arg0.getId()) {
            return -1;
        } else if (this.id.equals(arg0.getId())) {
            return 0;
        } else {
            return 1;
        }*/

        return this.id.compareTo(arg0.getId());
    }
}
