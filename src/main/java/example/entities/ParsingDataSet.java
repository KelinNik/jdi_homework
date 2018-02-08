package example.entities;

import com.epam.commons.DataClass;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParsingDataSet extends DataClass {

    public static Integer odd;
    public static Integer even;
    public static List<String> stringOfElements = new ArrayList<>();
    public static String dataOfColors = " ";
    public static String dataOfMetals = " ";
    public static List<String> stringOfVegetables = new ArrayList<>();
    //public static List<String> results = new ArrayList<>();

    public static MetalColorsDataSet parseJson() throws IOException {

        File file = new File("ex8_jdi_metalsColorsDataSet.json");
        String content = FileUtils.readFileToString(file, "utf-8");

        JSONObject jsonObject = new JSONObject(content);

        for (int i = 1; i < 2; i++) {
            JSONObject data = (JSONObject) jsonObject.get("data_" + i);
            JSONArray summaryList = (JSONArray) data.get("summary");
            Iterator<Object> iterator = summaryList.iterator();
            List<Integer> numbers = new ArrayList<>();
            while (iterator.hasNext()) {
                numbers.add((Integer) iterator.next());
                //          results.add((Integer) iterator.next());
            }
            odd = numbers.get(0);
            even = numbers.get(1);

            JSONArray elementsList = (JSONArray) data.get("elements");
            Iterator<Object> iterator1 = elementsList.iterator();
            while (iterator1.hasNext()) {
                stringOfElements.add((String) iterator1.next());
                //        results.add((String) iterator1.next());
            }

            String color = (String) data.get("color");
            dataOfColors = color;
            //  results.add(dataOfColors);

            String metals = (String) data.get("metals");
            dataOfMetals = metals;
            //results.add(dataOfMetals);

            JSONArray vegetables = (JSONArray) data.get("vegetables");
            Iterator<Object> iterator2 = vegetables.iterator();
            while (iterator2.hasNext()) {
                stringOfVegetables.add((String) iterator2.next());
                //  results.add((String) iterator2.next());
            }
        }
        return new MetalColorsDataSet(odd, even, stringOfElements, dataOfColors, dataOfMetals, stringOfVegetables);
    }

//    @Override
//    public String toString() {
//        return "Summary: " + summaryNumber + "\n" +
//                "Elements: " + stringOfElements + "\n" +
//                "Color: " + dataOfColors + "\n" +
//                "Metal: " + dataOfMetals + "\n" +
//                "Vegetables: " + stringOfVegetables;
//    }
}
