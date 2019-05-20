package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfCounts {
    //this statement is used to get the count of elements
    public static String getNoOfCounts(String str) {
        //arraya list for splitting with white sapces
        List<String> StringList = Arrays.asList(str.split("[\\W_]+"));
        Map<String, Integer> Map = new HashMap<>();
        for (String each : StringList)
        {
            //if map contains the elements in the string each
            if (Map.containsKey(each))
            {
                //then replace each element of the string
                Map.replace(each, Map.get(each) + 1);
            } else
                Map.put(each, 1);
        }
        //it returns the map values in string
        return Map.toString();
    }
    }
