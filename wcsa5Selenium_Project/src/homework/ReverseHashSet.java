package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ReverseHashSet {
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(9);
	hs.add(8);
	hs.add(7);
	hs.add(6);
	hs.add(5);
	hs.add(null);
	ArrayList<Integer> al=new ArrayList<Integer>(hs);
    System.out.println(al);
    Collections.reverse(al);
    System.out.println(al);
//    Collections.sort(al);
//    System.out.println(al);
	
}
}
