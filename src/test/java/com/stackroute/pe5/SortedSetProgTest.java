package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetProgTest {
public SortedSetProg sortedSetProg;
    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sortedSetProg=new SortedSetProg();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sortedSetProg=null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {
            String expected="[Alice, Bluto, Eugene, Harry, Olive]";
            String actual=sortedSetProg.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");
        //This method checks the actual output with expected output.
            assertEquals(expected,actual);
        }

    }
