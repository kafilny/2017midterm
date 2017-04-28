package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import databases.ConnectDB;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> ll=new LinkedList<String>();

		Scanner input=new Scanner(System.in);
		System.out.println("please enter state number");
		int statenumber=input.nextInt();
		Scanner sct=new Scanner(System.in);
		for(int i=0;i<statenumber;i++){
			//Scanner sct=new Scanner(System.in);
			System.out.println("enter state name");
			String statename=sct.nextLine();
			ll.add(statename);
		}

		Iterator it=ll.iterator();
		while(it.hasNext()){
		System.out.println( it.next());
		//ConnectDB condb=new ConnectDB();
	   // condb.InsertDataFromArrayListToMySql(list,  kafilarrayl, kacolcol);
	    
		}

	}

}
