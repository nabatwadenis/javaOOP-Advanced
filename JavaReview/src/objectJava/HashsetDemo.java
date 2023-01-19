package objectJava;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("bob");
		hashSet.add("Dylan");
		hashSet.add("tyris");
		hashSet.add("Lucy");
		hashSet.add("Lucy");
		
		System.out.println(hashSet);
		System.out.println(hashSet.contains("Bill"));
		

	}

}
