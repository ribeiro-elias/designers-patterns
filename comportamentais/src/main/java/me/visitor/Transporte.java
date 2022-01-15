package me.visitor;

public abstract class Transporte {
    private String name;
    private Integer price;

    public Transporte(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Transporte() {
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public abstract Integer getPriceWithTaxes(TransportVisitor visitor);
}
