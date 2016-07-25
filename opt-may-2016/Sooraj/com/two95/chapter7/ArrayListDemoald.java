package com.two95.chapter7;
import java.util.*;
public class ArrayListDemoald {
	public static void main(String args[]) {
		List list = new ArrayList();
		// Add objects.
		list.add("Hello");
		list.add("World");
		list.add("World");
		list.add("ABC");
		// Get the objects
		for (int i = 0; i < list.size(); i++) {
		String s1 = (String) list.get(i);
		System.out.println(s1);
		}
		}
	}

