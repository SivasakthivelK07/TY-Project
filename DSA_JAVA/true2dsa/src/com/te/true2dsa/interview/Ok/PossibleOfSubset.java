package com.te.true2dsa.interview.Ok;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleOfSubset {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		List<Set<Integer>> subsets = generateSubsets(input);
		System.out.println(subsets);
	}

	public static List<Set<Integer>> generateSubsets(int[] nums) {
        List<Set<Integer>> result = new ArrayList<>();
        result.add(new HashSet()); // Start with the empty subset
        System.out.println(result);
        for (int num : nums) {
            // For each number, add it to existing subsets
            int currentSize = result.size();
            for (int i = 0; i < currentSize; i++) {
                Set<Integer> currentSubset = new HashSet<>(result.get(i));
                currentSubset.add(num);
                result.add(currentSubset);
            }
        }
        return result;
}

}
