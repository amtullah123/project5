package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapObjectTest {
    public MapObject mapObject;

    @Before
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    public void setUp() throws Exception {
        mapObject=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mapObject=null;
    }

    @Test
    public void rotateValue() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=MapObject.rotateValue(map);
        //This method checks the actual output with expected output.
        assertEquals(expexted,actual);
    }

    @Test
    public void rotateValueSecond() {
        String expexted="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=MapObject.rotateValue(map);
        //This method checks the actual output with expected output.
        assertEquals(expexted,actual);
    }

}