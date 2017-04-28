package algorithm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception  {
		
		int [] num = new int[100];
		
		Random rand = new Random();
		System.out.println("unsorted array: ");
		for(int i=0; i<num.length; i++){
		num[i] = rand.nextInt(100);
		System.out.println(num[i]);
			
		}
		ConnectDB connectsql=new ConnectDB();

		//Selection Sort
		Sort algo = new Sort();
	    algo.selectionSort(num);
	    System.out.println("selectionsorted array: ");
		Sort.printSortedArray(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
       connectsql.InsertDataFromArryToMySql(num, "selectionsort", "sorting algorithm");
        List<String> numbersofaray=connectsql.readDataBase("selectionsort", "sorting algorithm");
	    for(String st:numbersofaray){
        	System.out.println(st);
        }
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//bubble sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		
	

	//quicksort
	    algo.quickSort(num,100,1000);
		long QuicksortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
	}
}

