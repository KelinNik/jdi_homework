package example.enums;

public enum Users {

    PITER_CHAILOVSKII("epam", "1234");

    public String name;
    public String password;

    Users(String name, String password) {
        this.name = name;
        this.password = password;
    }
}