package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer [] arr ={1,10,3,4,5,6,7,8,4,6,1,8,20};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        stream(list2);





    }
    public static void stream (ArrayList <Integer> list2 ) {
        Stream<Integer> stream = list2.stream();
        stream.distinct().sorted().forEach(System.out::println);
        //stream.sorted().forEach(System.out::println);


    }


}