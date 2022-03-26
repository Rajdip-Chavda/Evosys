//package mypackage;

import java.util.*;
class hashmap
{
	public static void main(String args[])
	{
		Map<String,Integer> cource= new HashMap<String,Integer>();
		
		//adding cources.
		cource.put("java ",new Integer(6));
		cource.put("Cloude ",new Integer(7));
		cource.put("Programming ",new Integer(5));
		cource.put("Data Science ",new Integer(2));
		
		//displaying size of total cources 
		System.out.println("total cource's :"+cource.size());
		
		Set<Map.Entry<String, Integer>> st=cource.entrySet();
		
		for(Map.Entry<String, Integer> me :st)
		{
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		String searchKey = "java ";
		if(cource.containsKey(searchKey))
			System.out.println("found total "+cource.get(searchKey)+" "+searchKey);
	}
}