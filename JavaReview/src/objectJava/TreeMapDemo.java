package objectJava;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String>  treeMap= new TreeMap<>();
		treeMap.put(3,"D");
		treeMap.put(4, "B");
		treeMap.put(1, "C");
		treeMap.put(2, "A");
		
		System.out.println(treeMap);
		
		
	}

}
