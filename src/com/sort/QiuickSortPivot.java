package com.sort;

import java.util.Arrays;

public class QiuickSortPivot 
{
	public int partition(int[] array,int low,int high)
	{
		
		int pivot=array[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(array[j]<=pivot)
			{
				i++;
				int temp=array[j];
				array[j]=array[i];
				array[i]=temp;
						
			}
		}
		int temp=array[high];
		array[high]=array[i+1];
		array[i+1]=temp;
		
		
		return i+1;
	}
	public void sort(int[] array,int l,int r)
	{
		if(l<r)
		{
		int pi=partition(array,l,r);
		sort(array,l,pi-1);
		sort(array,pi+1,r);
		
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args)
	{
		 int[] array = {0, 3, 2, 5, 6, 1, 3, 14, 12};
		 int len=array.length;
		// System.out.println(len);
		 QiuickSortPivot qiuickSortPivot=new QiuickSortPivot();
		 qiuickSortPivot.sort(array,0,len-1);
		 
	}

}
