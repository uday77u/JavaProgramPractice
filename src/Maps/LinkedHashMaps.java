package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l = new LinkedHashMap();
		l.put("Manual", 123);
		l.put("SQL", 78);
		System.out.println(l);
	}

}
