package com.sort;

import java.util.Arrays;

public class RadixSort 
{

	int getMax(int[] array)
	{
		int n=array.length;
		int largest=array[0];
		for(int i=0;i<n;i++)
			if(array[i]>largest)
				largest=array[i];
		return largest;
	}
	
	public void radixSort(int[] array,int exp)
	{
		int n=array.length;
		int[] output=new int[n];
		int[] count=new int[10];
		Arrays.fill(count,0);
		
		for(int i=0;i<n;i++)
			count[(array[i]/exp)%10]++;
		
		for(int i=1;i<n;i++)
			count[i]+=count[i-1];
		
		for(int i=n-1;i>=0;i--)
		{
			output[count[(array[i]/exp)%10]-1]=array[i];
			count[(array[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
			array[i]=output[i];
	}
	public void sort(int[] array)
	{
		int max=getMax(array);
		for(int exp=1;max/exp>0;exp*=10)
			radixSort(array,exp);
		
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) 
	{
		  int[] array = {0, 3, 2,115, 200, 1000, 3, 14, 12};
		  RadixSort sort=new RadixSort();
		  sort.sort(array);
	}

}
