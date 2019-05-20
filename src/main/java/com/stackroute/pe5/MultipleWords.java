package com.stackroute.pe5;


import java.util.HashMap;
import java.util.Map;

public class MultipleWords
{

    //This statement returns the string with boolean value i.e string appears 2 more in the array it returns true otherwise it returns false.
    public static Map<String,Boolean> checkAppearanceOfString(String[] s)
    {
        int i=0;
        int count=0;

        //Creation of Map
        Map<String,Boolean> map=new HashMap<>();
        for(String counts:s)
        {

            //This statement checks the count string how many times exists in the array.
            if(counts.contains(s[i]))
            {

                //put() is used to store the value in the Map.
                map.put(s[i], false);
                if(count>2)
                {
                    map.put(s[i], true);
                }

            }
            count++;
            i++;

        }

        return map;
    }
}