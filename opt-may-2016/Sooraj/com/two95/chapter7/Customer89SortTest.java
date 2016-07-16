package com.two95.chapter7;

import java.util.*;
public class Customer89SortTest {
public static void main(String args[]) {
TreeSet set = new TreeSet(new LastNameComparator());
set.add(new Customer("John", "Smith", "12345"));
set.add(new Customer("Laura", "Jackson", "456546"));
set.add(new Customer("Thomas", "Edison", "78989"));
Iterator itr = set.iterator();
while (itr.hasNext()) {
Customer customer = (Customer) itr.next();
System.out.println(customer.getLastName() + " "
+ customer.getFirstName() + " " + customer.getSsn());
}
}
}
