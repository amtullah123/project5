package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
   public static NumberOfCounts numberOfCounts;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        numberOfCounts=new NumberOfCounts();
    }


    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        numberOfCounts=null;
    }

    @Test
    public void getNoOfCounts() {
        String actual=NumberOfCounts.getNoOfCounts("one one -one___two,,three,one @three*one?two");
        String expected="{one=5, two=2, three=2}";
        //This method checks the actual output with expected output.
    assertEquals(expected,actual);
    }
}