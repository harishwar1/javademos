package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[] args) {
		List<String> places =new LinkedList<String>();
		places.add("mumbai");
		places.add("amritsar");
		places.add("bengal");
		places.add("hyderabad");
		places.add("shadnagar");
		printlist(places);
		print1(places);
	}

	private static void print1(List<String> places) {
		// TODO Auto-generated method stub
		for(Iterator<String> it=places.iterator();it.hasNext();) {
			System.out.println(it.next());}
		
	}

	private static void printlist(List<String> places) {
		
	for(Iterator<String> it=places.iterator();it.hasNext();) {
		System.out.println(it.next());
		if(it.equals("mumbai")) {
			it.remove();
		}
	}
	System.out.println("----------------");
	}
	

}
