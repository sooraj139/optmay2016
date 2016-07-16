package com.two95.chapter7;

public class StringBufferDemo23 {

	public static void main(String args[]) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("A silly young cricket ");
		buffer.append(" accustomed to sing");
		buffer.append(" through the warm sunny days");
		buffer.insert(5, "Hello");
		String finalText = buffer.toString();
		System.out.println(finalText);
	}
}
