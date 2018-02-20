package example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static example.enums.MetalsColorsKeysEnum.*;

@Getter
@AllArgsConstructor
public class MetalColorsDataSet {

    private Integer[] summary;
    private String[] elements;
    private String color;
    private String metals;
    private String[] vegetables;

    public Map<String, String> getResultLog() {
        Map<String, String> result = new HashMap<>();
        result.put(SUMMARY.text, Integer.toString(summary[0] + summary[1]));
        result.put(ELEMENTS.text, Arrays.stream(elements).collect(Collectors.joining(", ")));
        result.put(COLOR.text, color);
        result.put(METAL.text, metals);
        result.put(VEGETABLES.text, Arrays.stream(vegetables).collect(Collectors.joining(", ")));
        return result;
    }
}