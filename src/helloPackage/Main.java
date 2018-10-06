package helloPackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

       
        Set<String> set1 = new HashSet<>();
        set1.add("Neal");
        set1.add("Carl");
        set1.add("Lynn");
        set1.add("Tom");
        set1.add("Kelly");
        System.out.println(set1);

        //Sorted order
        Set<String> set2 = new TreeSet<>();
        set2.add("Mark");
        set2.add("Nick");
        set2.add("Rick");
        set2.add("Neal");
        set2.add("Lynn");
        System.out.println(set2);

        Set<String> intersection = new HashSet<>(set1);
        System.out.println(intersection);

        //Intersection of set1 and set2
        intersection.retainAll(set2);
        System.out.println(intersection);

        //Difference
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set1);
        System.out.println(difference);

        if(difference.isEmpty()){
            System.out.println(intersection.size() + " items have been removed ");
        }






    }
}
