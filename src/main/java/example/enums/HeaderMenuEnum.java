package example.enums;

public enum HeaderMenuEnum {
    HOME("Home"),
    CONTACT_FORM("Contact form"),
    SERVICE("Service"),
    METALS_COLORS("Metals & Colors");

    public String item;

    HeaderMenuEnum(String item){
        this.item = item;
    }
}
