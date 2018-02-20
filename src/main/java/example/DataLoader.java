package example;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import example.entities.MetalColorsDataSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class DataLoader {

    public Object[] data;

    DataLoader() throws FileNotFoundException {
        JsonObject jsonObject = new JsonParser().parse(new FileReader("src/main/resources/ex8_jdi_metalsColorsDataSet.json")).getAsJsonObject();
        Map<String, MetalColorsDataSet> metalsColorsData = new Gson().fromJson(jsonObject, new TypeToken<Map<String, MetalColorsDataSet>>() {
        }.getType());

        data = metalsColorsData.values().toArray();
    }
}
