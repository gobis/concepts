package HashFunction;

import java.util.HashMap;

public class EntryClass {
	
	
	
	public static void main(String []args){
		
		HashMap<Integer, ValueClass> hm = new HashMap<Integer, ValueClass>(5, 0.4f);
		ValueClass v1 = new ValueClass();
		v1.setId(34);
		
		ValueClass v2 = new ValueClass();
		v2.setId(35);
		
		ValueClass v3 = new ValueClass();
		v3.setId(36);
		
		ValueClass v4 = new ValueClass();
		v4.setId(37);
		
		ValueClass v5 = new ValueClass();
		v5.setId(38);
		
		hm.put(v1.getId(),v1);
		hm.put(v2.getId(),v2);
		hm.put(v2.getId(),v4);
		hm.put(v3.getId(),v3);
		hm.put(v5.getId(),null);
		
		/*HashMap<KeyClass, ValueClass> hm = new HashMap<KeyClass, ValueClass>(5, 0.4f);
		
		hm.put(new KeyClass(), new ValueClass());
		hm.put(new KeyClass(), new ValueClass());*/
		
		System.out.println(hm);
		
		
	}

}
