package tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * primitive data type
		 * int helloWorld = 7;
		 * double num2 = 5.0;
		 * boolean b = true;
		 * char c = 'm';
		 * // Non-primitive data type
		 * String str = "Hello world";
		 * //String.split(String str);********************
		 * System.out.println(str);
		 */
		// Scanner sc=new Scanner(System.in);
		/*
		 * double l0=sc.nextDouble();
		 * int l1=sc.nextInt();//to scan int value
		 * boolean l2=sc.nextBoolean();//to scan boolean value true or false
		 * 
		 * 
		 * String s=sc.next();//to scan string value or take string as input
		 * sc.close();
		 * s.equals("helloWorld");//compare the string s value with the value
		 * "helloWorld"
		 * int x=Integer.parseInt(s);//convert string s into integer and store in x
		 * if(s.equals("m")){
		 * x=x+2;
		 * }
		 * else if(s.equals("p")){
		 * x=1;
		 * }
		 * else{
		 * x=0;
		 * }
		 * 
		 * String s[]={"hello", "world", "there", "IS"};
		 * 
		 * for (String element:s){
		 * System.out.println(element);// iterate the elements in the array s
		 * ///it is same as printing all the elements in the array .
		 * }
		 * 
		 * int a[] = new int[5];/// array declaration
		 * // int b = a.length;
		 * System.out.println(a[1]);// output is 0.
		 */
		/*
		 * // set store unique data item in unordered manner. syntax below
		 * Set<Integer> unique = new HashSet<Integer>();
		 * unique.add(1);
		 * unique.add(3);
		 * unique.add(2);
		 * unique.add(1);
		 * unique.remove(3);
		 * boolean x = unique.contains(3);
		 * // System.out.println(x);
		 * // unique.clear();// to delete all unique items from the Set
		 * boolean z = unique.isEmpty();// to see if the set is empty
		 * int y = unique.size();// tell the size of the set
		 * System.out.println(y);
		 * // set are very fast on performing operation like adding ,removing & finding
		 * // element
		 */
		/*
		 * Set<Integer> t = new TreeSet<Integer>();
		 * // store data in ordered manner, same as hash set
		 * t.add(9);
		 * t.add(3);
		 * t.add(1);
		 * t.add(2);
		 * t.add(6);
		 * t.add(4);
		 * t.add(5);
		 * t.add(8);
		 * t.add(7);
		 * t.add(0);
		 * // System.out.println(t);
		 * 
		 * Set<Integer> m = new LinkedHashSet<Integer>();
		 * // similar to set but faster on certain operation
		 * m.add(5);
		 * m.add(8);
		 * m.add(7);
		 * m.add(0);
		 * // System.out.println(m);
		 * 
		 * ArrayList<Integer> m2 = new ArrayList<Integer>();
		 * m2.add(3);
		 * m2.add(1);
		 * int f = m2.get(0);
		 * m2.set(1, 3);// store the value 3 in 1 index of the ArrayList
		 * {set(index,data)}
		 * System.out.println(m2.subList(1, 2));//get element from index 1 to index 2
		 * ,excliding the index 2 or not including the index 2
		 * System.out.println(m2);
		 * 
		 * //Linked list is faster in certain operation
		 * LinkedList<Integer> m3 = new LinkedList<Integer>();
		 */
		/*
		 * // map is like key value pair (dictionary)
		 * Map m = new HashMap();
		 * m.put("monazir", 3);// here key is monazir and value is 3
		 * m.put("git", 1);
		 * // System.out.println(m.get("monazir"));
		 * // it will overide the value over same key
		 * System.out.println(m);
		 * 
		 * Map n = new TreeMap();
		 * // store data in the sorted order and key is of same data type
		 * n.put("zsd", 123);
		 * n.put("txzc", 2424);
		 * n.put("a", "one");
		 * System.out.println(n);
		 * 
		 * 
		 * Map d= new LinkedHashMap();
		 * //store data in the order they are put
		 * n.containsKey("a");//return true if the map contains the key a
		 * n.containsValue(123);//return true if the map contains the value 123
		 * n.get(5);//return null as key 5 is not in the map
		 * n.values();//return all the values in the map
		 * n.clear();//empty the map
		 * n.isEmpty();//check if the map is empty
		 */
		/*
		 * // program to count the number of characters that appear in the String start
		 * // here
		 * Map m = new HashMap();
		 * String str = "My crazy cat running all over the place";
		 * // System.out.println(str.toCharArray());
		 * for (char x : str.toCharArray()) {
		 * if (m.containsKey(x)) {
		 * int old = (int) m.get(x);
		 * m.put(x, old + 1);
		 * } else {
		 * m.put(x, 1);
		 * }
		 * }
		 * m.remove(' ');
		 * System.out.println(m);
		 * 
		 * // program to count the number of characters that appear in the String end
		 * here
		 */
		int arr[] = { -98, 4, 6, 9, 1, 34, 987, 0, 34 };
		Arrays.sort(arr, 1, 7);// sort the array only from index 1 to index 7
		for (int m : arr) {
			System.out.print(m + ", ");
		}
		
	}

}
