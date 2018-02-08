package example.enums;

public enum Metals {
    SELEN("Selen"),
    GOLD("Gold"),
    SILVER("Silver"),
    BRONZE("Bronze");

    public String text;

    Metals(String text) {
        this.text = text;
    }
}
