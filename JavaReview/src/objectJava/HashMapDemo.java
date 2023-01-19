package objectJava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		if(map.containsKey("a")) {
			Integer a =map.get("a");
			System.out.println("value for key a is: -" +a);
		}
		for(String key: map.keySet()) {
			System.out.println("key: " + key + " value " + map.get(key));
		}
		
		System.out.println(map);
		System.out.println(map.get("b"));
		

	}

}
