package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {
	Map<String, TreeMap<Integer,String>> temp;
	int previousTimeStamp;
	public TimeMap() {
		temp = new HashMap<>();
	}

	public void set(String key, String value, int timestamp) {
		previousTimeStamp = timestamp;
		if(temp.containsKey(key))
		{
			TreeMap<Integer,String> current = temp.get(key);
			current.put(timestamp,value);
			temp.put(key, current);

		}else{
			TreeMap<Integer,String> current = new TreeMap<>();
			current.put(timestamp,value);
			temp.put(key, current);
		}
	}

	public String get(String key, int timestamp) {
		if(!temp.containsKey(key))
			return "";
		TreeMap<Integer,String> current = temp.get(key);
		Integer result = current.floorKey(timestamp);
		if(result != null)
		{
			return current.get(result);
		}
		return "";

	}
}

