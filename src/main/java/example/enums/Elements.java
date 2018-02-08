package example.enums;

public enum Elements {
    WATER("Water"),
    FIRE("Fire"),
    WIND("Wind"),
    EARTH("Earth");

    public String text;

    Elements(String text) {
        this.text = text;
    }
}
