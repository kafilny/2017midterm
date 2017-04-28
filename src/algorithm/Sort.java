package algorithm;

import java.util.Arrays;
import java.util.Random;



public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
 
 public int[] selectionSort(int [] array){
     final long startTime = System.currentTimeMillis();
     int [] list = array;

     for(int i=0; i<array.length; i++){
         for(int j=i+1; j<array.length; j++){
             if(array[j]<array[i]){
                 int temp = array[j];
                 array[j] = array[i];
                 array[i] = temp;
             }
         }
     }
     final long endTime = System.currentTimeMillis();
     final long executionTime = endTime - startTime;
     this.executionTime = executionTime;
     return list;
 }
    public	int[] insertionSort(int [] array){
		 final long startTime = System.currentTimeMillis();
		 int [] num = new int[100];
   		Random rand = new Random();
   		System.out.println("insertion unsorted aray");
   		for(int k=0; k<num.length; k++){
   		num[k] = rand.nextInt(100);
   	    System.out.println(num[k]);
   		}
	       	        //implement here
	        for(int i=0;i<num.length;i++){
	            int minindex=i;
	            for(int j=i+1;j<num.length;j++){
	                if(num[j]<num[minindex]){
	                    minindex=j;
	                   }
                 }
	           int temp=num[minindex];
	            num[minindex]=num[i];
	            num[i]=temp;
	        }
	        System.out.println("insertion sorted array");
	        for(int i=0;i<num.length;i++){
	            System.out.println(num[i]);
                       }
	       final long endTime = System.currentTimeMillis();
	       final long executionTime = endTime - startTime;
	        this.executionTime = executionTime;
	        return num;
	        }

    public int[] bubbleSort(int [] array){
    	 final long startTime = System.currentTimeMillis();
		 int [] num = new int[100];
   		Random rand = new Random();
   		System.out.println("bubble unsorted aray");
   		for(int k=0; k<num.length; k++){
   		num[k] = rand.nextInt(100);
   	    System.out.println(num[k]);
   		}
    	
        //implement here
        int n = num.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(num[j-1] > num[j]){  
                                 //swap elements  
                                 temp = num[j-1];  
                                 num[j-1] = num[j];  
                                 num[j] = temp;  
                         }  
                          
                 } 
                 System.out.println("bubble sorted array");
     	        for(int l=0;i<num.length;l++){
     	            System.out.println(num[l]);   
         }
        final long endTime = System.currentTimeMillis();
         final long executionTime = endTime - startTime;
       this.executionTime = executionTime;
          } 
       return num;
    }
        
  public int [] mergeSort(int [] array){
	  final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        
        

        return list;
    }
  public int [] quickSort(int [] array, int low, int high){
      final long startTime = System.currentTimeMillis();
      int [] list = array;
      //implement here
      if(low < high){
          int next = breaker(array, low, high);
          quickSort(array, low, next-1);
          quickSort(array, next+1, high);
      }
      final long endTime = System.currentTimeMillis();
      final long executionTime = endTime - startTime;
      this.executionTime = executionTime;
      return list;
  }
  public int breaker (int array[], int x, int y){
      int part = x-1;
      int pivot = array[y];
      for (int i = x; i <= y; i++) {
          if(array[i] <= pivot){
              part++;
              if(part!=i){
                  array[part] = array[part] ^ array[i];
                  array[i] = array[part] ^ array[i];
                  array[part] = array[part] ^ array[i];
              }
          }
      }
    return part;  
  }

	
   
 
   
   

       // return list;
    
    
   
        
        public class HeapsortTest {
        	// Java program for implementation of Heap Sort
        	//public class HeapSort
//        	{
        	 public int [] heapSort(int [] array){
            	 final long startTime = System.currentTimeMillis();
                int [] list = array;
                //implement here
                
        		//public void sort(int arr[])
        		//{
        			int n = array.length;

        			// Build heap (rearrange array)
        			for (int i = n / 2 - 1; i >= 0; i--)
        				heapify(array, n, i);

        			// One by one extract an element from heap
        			for (int i=n-1; i>=0; i--)
        			{
        				// Move current root to end
        				int temp = array[0];
        				array[0] = array[i];
        				array[i] = temp;

        				// call max heapify on the reduced heap
        				heapify(array, i, 0);
        			}
        			return list;
        		}

        		// To heapify a subtree rooted with node i which is
        		// an index in arr[]. n is size of heap
        		void heapify(int arr[], int n, int i)
        		{
        			int largest = i; // Initialize largest as root
        			int l = 2*i + 1; // left = 2*i + 1
        			int r = 2*i + 2; // right = 2*i + 2

        			// If left child is larger than root
        			if (l < n && arr[l] > arr[largest])
        				largest = l;

        			// If right child is larger than largest so far
        			if (r < n && arr[r] > arr[largest])
        				largest = r;

        			// If largest is not root
        			if (largest != i)
        			{
        				int swap = arr[i];
        				arr[i] = arr[largest];
        				arr[largest] = swap;

        				// Recursively heapify the affected sub-tree
        				heapify(arr, n, largest);
        			}
        		}

        		/* A utility function to print array of size n */
        		 void printArray(int arr[])
        		{
        			int n = arr.length;
        			for (int i=0; i<n; ++i)
        				System.out.print(arr[i]+" ");
        			System.out.println();
        		}

        

      //  return list;
    }


  
        public int [] bucketSort(int [] array,int maxVal){
          	 final long startTime = System.currentTimeMillis();
              int [] list = array;
       	// public static void sort(int[] a, int maxVal) {
       	      int [] bucket=new int[maxVal+1];
       	 
       	      for (int i=0; i<bucket.length; i++) {
       	         bucket[i]=0;
       	      }
       	 
       	      for (int i=0; i<array.length; i++) {
       	         bucket[array[i]]++;
       	      }
       	 
       	      int outPos=0;
       	      for (int i=0; i<bucket.length; i++) {
       	         for (int j=0; j<bucket[i]; j++) {
       	            array[outPos++]=i;
       	         }
       	      }
       	   final long endTime = System.currentTimeMillis();
           final long executionTime = endTime - startTime;
           this.executionTime = executionTime;
       		return list;
       	   }
       

    
    public int [] shellSort(int [] array){
    	 final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        
        int inner, outer;
	    int temp;
	 
	    int h = 1;
	    while (h <= array.length / 3) {
	      h = h * 3 + 1;
	    }
	    while (h > 0) {
	      for (outer = h; outer < array.length; outer++) {
	        temp = array[outer];
	        inner = outer;
	 
	        while (inner > h - 1 && array[inner - h] >= temp) {
	          array[inner] = array[inner - h];
	          inner -= h;
	        }
	        array[inner] = temp;
	      }
	      h = (h - 1) / 3;
	    }
	    final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
		return list;
	  }
	 
	 
    

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
