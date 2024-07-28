package com.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();

		str.add("Sarang");
		str.add("khangar");
		str.add("Sarang");

		str.equals("Sarang");

		List<String> strr = new ArrayList<String>();

		String name = "Sarang Manoj Khangar";

		String[] updatedName = name.split(" ");

		for (String str2 : updatedName) {
			str.add(str2);
		}

	}
}
