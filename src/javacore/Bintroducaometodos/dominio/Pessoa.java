package javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String name;
    private int age;

    public void print () {
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age);
    }

    public void setName (String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Please, insert your name on the camp.");
        }
        this.name = name;
    }

    public void setAge (int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        }
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }
}
