package models;

import scala.util.parsing.combinator.testing.Str;

/**
 * Created by Peem on 7/12/2018.
 */
public class Products {
    private String size,name,color;
    private Double price;
    private int amount;

    public Products(String name, String size, String color, Double price, int amount) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.amount = amount;
        this.size = size;
    }



    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
