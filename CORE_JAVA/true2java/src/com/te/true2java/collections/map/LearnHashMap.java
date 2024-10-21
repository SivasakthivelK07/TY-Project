package com.te.true2java.collections.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.te.true2java.collections.set.Employee;

public class LearnHashMap {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Employee(1, "FN01", "LN01", LocalDate.of(2020, 7, 24), 35000f, 24));
		map.put(12, new Employee(12, "FN12", "LN12", LocalDate.of(2015, 5, 19), 30000f, 64));
		map.put(2, new Employee(2, "FN02", "LN02", LocalDate.of(2019, 6, 20), 40000f, 24));
		map.put(6, new Employee(6, "FN06", "LN06", LocalDate.of(2022, 5, 2), 50000f, 27));
		map.put(5, new Employee(5, "FN05", "LN05", LocalDate.of(2020, 7, 18), 45000f, 34));
 
//		BiConsumer<Integer, Employee> biConsumer=(i,e)->System.out.println(i+" : "+e);

		map.forEach((i, e) -> System.out.println(i + " : " + e));
	}

}
