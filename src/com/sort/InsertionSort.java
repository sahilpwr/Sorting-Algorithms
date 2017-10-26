package com.sort;

import java.util.Arrays;

public class InsertionSort {
	public void sort(int[] array)
	{
		int len=array.length;
		for(int i=1;i<len;i++)
		{
			int j=i-1;
			int key=array[i];
			while(j>=0&&array[j]>key)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
				
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int[] array = {0, 3, 2, 5, 6, 1, 3, 14, 12};
		 int len=array.length;
		// System.out.println(len);
		 InsertionSort sort=new InsertionSort();
		 sort.sort(array);

	}

}
