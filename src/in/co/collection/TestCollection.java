package in.co.collection;

import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("bura mat dheko");
		c.add("bura mat kaho");
		c.add("bura mat suno");
		//System.out.println("length of Collection: " + c.size());
//print all element of collection
		//for (Object o :c){
			//System.out.println(o);
		//convert collection into array
		Object [] oArray=c.toArray();
		
		//print all element of array
		for(Object ele:oArray){
			String s=(String)ele;
			System.out.println(s);
		}
	}

}
