package entity;

public class Card {
    private String color;
    private String suite;
    private String number;
    private Float value;

    public Card(String color, String suite, String number, Float value) {
        this.color = color;
        this.suite = suite;
        this.number = number;
        this.value = value;
    }

    @Override
    public String toString() {
        return "color="+this.color+", suite="+this.suite+", number="+this.number+", value ="+this.value;
    }

    public String getColor() {
        return color;
    }

    public String getSuite() {
        return suite;
    }

    public String getNumber() {
        return number;
    }

    public Float getValue() {
        return value;
    }
}
