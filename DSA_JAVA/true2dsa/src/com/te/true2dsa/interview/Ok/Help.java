package com.te.true2dsa.interview.Ok;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Help {

	public static void main(String[] args) {
        String input = "programming"; 
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        Map<Character, Long> charCountMap = str.chars() 
                .mapToObj(c -> (char) c) 
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        
        System.out.println("Duplicate characters:");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) 
                .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}


