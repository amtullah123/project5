package com.stackroute.pe5;

import java.util.Map;

public class MapObject {
    public static String rotateValue(Map<String, String> map) {
        String val1 = map.get("val1");
        //This statment is used to replace values
        map.replace("val2", val1);
        map.replace("val1", " ");
        //it returns the map values in string
        return map.toString();
    }
}

