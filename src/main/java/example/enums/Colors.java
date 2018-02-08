package example.enums;

public enum Colors {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow");

    public String text;

    Colors(String text) {
        this.text = text;
    }
}
