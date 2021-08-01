package First;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class java_maps {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("category ","test");
		map.put("name ", "Selenium");
		for(Entry<String, String> key:map.entrySet())
		{	
			System.out.print(key.getKey());
			System.out.println(key.getValue());
		}
		}

}
