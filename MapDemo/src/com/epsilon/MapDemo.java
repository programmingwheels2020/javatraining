package com.epsilon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String>  map = new HashMap<String, String>();
		
		map.put("IND", "India");
		
		map.put("ENG", "ENGLAND");
		map.put("USA", "Unied States of America");
		map.put("CAN", "CANADA");
		
		
		System.out.println(map.toString());
		
		Set set = map.entrySet();
		
        Iterator<Map.Entry<String, String>> itr = set.iterator();
        
        while(itr.hasNext()) {
        	Map.Entry entry = itr.next();
        	
        	System.out.println(entry.getKey());
        	System.out.println(entry.getValue());
        }
		
		

	}

}
