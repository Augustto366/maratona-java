package javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Smartphone other = (Smartphone) obj;
        return serialNumber == other.serialNumber;
    }

    @Override
    public int hashCode() {
        return this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
