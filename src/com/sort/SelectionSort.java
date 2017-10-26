package com.sort;

import java.util.Arrays;

public class SelectionSort
{
public void sort(int[] array)
{
	int len=array.length;
			
	
	for(int i=0;i<len-1;i++)
	{
		int min_index=i;
		for(int j=i+1;j<len;j++)
		if(array[j]<array[min_index])
		{
			min_index=j;
		}
		int temp=array[i];
		array[i]=array[min_index];
		array[min_index]=temp;
	}
	System.out.println(Arrays.toString(array));
	
}

	public static void main(String[] args) 
	{
		int[] array = {0, 3, 2, 5, 6, 1, 3, 14, 12};
		 int len=array.length;
		// System.out.println(len);
		 SelectionSort sort=new SelectionSort();
		 sort.sort(array);
	}

}
