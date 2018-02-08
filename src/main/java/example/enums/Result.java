package example.enums;

public enum Result {
    SUMMARY("Summary: 11"),
    COLOR("Color: Red"),
    METAL("Metal: Selen"),
    ELEMENTS("Elements: Water, Fire"),
    VEGETABLES("Vegetables: Cucumber, Tomato");

    public String text;

    Result(String text) {
        this.text = text;
    }
}
