package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public ArrayList<String> getRemoveElements(ArrayList<String>namesList,String str,String str1)
    {
        //creating an array list
        ArrayList<String> List = new ArrayList<String>();
        for(int i=0;i<namesList.size();i++)
        {
            //adding elements in the list
            List.add(namesList.get(i));
        }
        //replacing the elements in the list
        List.set(0,"kiwi");
        List.set(2,"mango");
        System.out.println(List);
        //removing all the elements in the list
        namesList.removeAll(namesList);
        //returns empty list
         return namesList;
    }
}
