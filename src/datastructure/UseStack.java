package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String>st=new Stack<String>();
		st.add("kaf");
		st.add("nur");
		st.add("nal");
		st.add("kal");
		System.out.println("stack");
		Iterator it=st.iterator();
		while(it.hasNext()){
			System.out.println(st.pop());
		}
	}

}
