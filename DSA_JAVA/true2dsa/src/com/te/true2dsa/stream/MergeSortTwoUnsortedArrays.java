package com.te.true2dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortTwoUnsortedArrays {
	public static void main(String[] args) {
        Integer[] array1 = {5, 3, 9, 1, 4};
        Integer[] array2 = {2, 8, 7, 3, 4};

        List<Integer> result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());

        result.forEach(System.out::print);

//        // Output to Notepad (file handling part)
//        try (PrintWriter writer = new PrintWriter("output.txt")) {
//            for (Integer num : result) {
//                writer.println(num);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
