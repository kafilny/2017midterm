package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue=new LinkedList<String>();
		 queue.add("kaf");
		 queue.add("jon");
		 queue.add("fon");
		 queue.add("bon");
		 System.out.println("queue");
		 Iterator it=queue.iterator();
		 while(it.hasNext()){
			 System.out.println(queue.remove());
           }
      }
}
