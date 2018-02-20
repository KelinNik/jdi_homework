package example.enums;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public enum HeaderMenuEnum {
    HOME,
    CONTACT_FORM,
    SERVICE,
    METALS_COLORS("Metals & Colors");

    private String text;

    HeaderMenuEnum(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        if (Objects.isNull(text)) {
            return name().replaceAll("_", " ");
        } else {
            return text;
        }
    }
}
