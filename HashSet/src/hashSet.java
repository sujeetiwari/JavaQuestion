import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class hashSet {

	public static void main(String[] args) {
//		HashSet <Integer> h=new HashSet<>(6,0.5f);
//h.add(5);
//h.add(7);
//h.add(11);
//h.add(3);
//h.add(11);
//h.add(5);
//System.out.println(h);
//Hash MAP
//		country key,population value
		// hash map works in unordered way
		HashMap<String,Integer>map=new HashMap<>();
		map.put("India",120);
		map.put("US", 30);
		map.put("china", 150);
		System.out.println(map);
map.put("china", 180);
System.out.println(map);
//Search
if(map.containsKey("chin"))
{
	System.out.println("key is present in the map");
}else {
	System.out.println("key is not present in the map");
}
		System.out.println(map.get("china"));
		System.out.println(map.get("chin"));
//		iteration in hash map
//		int arr[]= {12,14,54};
//		for(int i=0;i<3;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println();
//		for(int val:arr) {
//			System.out.println(val+" ");
//			
//		}
//		System.out.println();
//		for( Map.Entry<String,Integer>e:map.entrySet()) {
//		System.out.println(e.getKey());
//		System.out.println(e.getValue());
//	}
//		Set<String>keys=map.keySet();
//		for(String key:keys) {
//		System.out.println(keys+ " " +map.get(keys));	
		map.remove("china");
		System.out.println(map);
//		}
	}
}
