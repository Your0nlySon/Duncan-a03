package exercise39.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution39 {

    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        //print the top part of the map
        System.out.println("Name                | Position          | Separation Date\n--------------------|-------------------|----------------");
        //call method 'printMap'
        sol.printMap();
    }

    private void printMap() {
        //create the map that can contain three strings
        Map<String, Integer> map = new TreeMap<>();
        map.put("Jacquelyn Jackson   | DBA               |", 60);
        map.put("Jake Jacobson       | Programmer        |", 50 );
        map.put("John Johnson        | Manager           | 2016-12-31", 40);
        map.put("Michaela Michaelson | District Manager  | 2015-12-19", 30);
        map.put("Sally Weber         | Web Developer     | 2015-12-18", 20);
        map.put("Tou Xiong           | Software Engineer | 2016-10-05", 10);
        //print the map with a for loop

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey());
    }
}
