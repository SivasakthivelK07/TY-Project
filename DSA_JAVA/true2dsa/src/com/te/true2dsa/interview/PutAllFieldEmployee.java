package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PutAllFieldEmployee {

	static class Employee {
		private String id;
		private String name;
		private String location;
		private String band;

		public Employee() {
			super();
		}

		public Employee(String id, String name, String location, String band) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.band = band;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getBand() {
			return band;
		}

		public void setBand(String band) {
			this.band = band;
		}

		@Override
		public int hashCode() {
			return Objects.hash(band, id, location, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(band, other.band) && Objects.equals(id, other.id)
					&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", band=" + band + "]";
		}

	}

	public static void main(String[] args) {
		String s = "id=1, name=Akash, location=Chennai, band= A1";
		 Map<String, String> collect = Arrays.stream(s.split(",")).map(pair->pair.split("="))
		 .collect(Collectors.toMap(k->k[0].trim(), v->v[1].trim()));
		 
		
		System.out.println(collect);
	}

}
