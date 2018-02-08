package example.entities;

import com.epam.commons.DataClass;

import java.util.List;

public class MetalColorsDataSet extends DataClass {

    public Integer odd;

    public Integer even;

    public List<String> elements;

    public String colors;

    public String metals;

    public List<String> salad;

    public MetalColorsDataSet(Integer odd, Integer even, List<String> elements, String colors, String metals, List<String> salad) {
        this.odd = odd;
        this.even = even;
        this.elements = elements;
        this.colors = colors;
        this.metals = metals;
        this.salad = salad;
    }
}
