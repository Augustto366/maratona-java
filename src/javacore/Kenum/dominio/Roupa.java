package javacore.Kenum.dominio;

public enum Roupa {
    TERNO('T'),
    SOCIAL('S');

    private final char t;

    Roupa(char t) {
        this.t = t;
    }

    public char getT() {
        return t;
    }
}
