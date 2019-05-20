package com.stackroute.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveElementsTest {
    public static RemoveElements RemoveElements;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        RemoveElements=new RemoveElements();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        RemoveElements=null;
    }

    @Test
    public void getRemoveElements() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Apple");
        array.add("Grape");
        array.add("Melon");
        array.add("Berry");
        String replace1="kiwi";
        String replace2="mango";
        ArrayList<String> result = new ArrayList<String>();
        result=RemoveElements.getRemoveElements(array,replace1,replace2);
        ArrayList<String> expected = new ArrayList<String>();
        //This method checks the actual output with expected output.
        assertEquals(expected, result);

    }
}
