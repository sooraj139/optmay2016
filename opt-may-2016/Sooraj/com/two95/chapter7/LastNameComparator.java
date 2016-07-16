package com.two95.chapter7;

import java.util.*;

public class LastNameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Customer89 c1 = (Customer89) o1;
		Customer89 c2 = (Customer89) o2;
		int index = c1.getSsn().compareTo(c2.getSsn());
		return index;
	}
}
