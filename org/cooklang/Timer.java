package org.cooklang;

public class Timer implements DirectionItem {
    public Quantity quantity;
    public String units;
    public String name;

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return name;
    }
}
