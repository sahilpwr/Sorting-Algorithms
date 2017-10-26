package com.sort;

import java.util.Arrays;

public class MergeSort 
{
	
	public void merge(int[] array,int l,int r,int m)
	{
		int lsize=m-l+1;
		int rsize=r-m;
		int[] left=new int[lsize];
		int[] right=new int[rsize];
		
		for(int i=0;i<lsize;i++)
		{
			left[i]=array[l+i];
		}
		for(int j=0;j<rsize;j++)
		{
			right[j]=array[m+1+j];
		}
		
		int k=l;
		int i=0;
		int j=0;
		while(i<lsize&& j<rsize)
		{
			if(left[i]<=right[j])
			{
				array[k]=left[i];
				i++;
			}
			else
			{
				array[k]=right[j];
				j++;
			}
		}
		while(i<lsize)
		{
			array[k]=left[i];
			i++;
			k++;
		}
		while(j<rsize)
		{
			array[k]=right[j];
			j++;
			k++;
		}
	}
	public void sort(int[] array,int l,int r)
	{
		if(l<r)
		{	
		int m =l+(r-l)/2;
		sort(array, l,m);
		sort(array,m+1,r);
		merge(array,l,r,m);
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) 
	{
		int[] array = {0, 3, 2, 5, 6, 1, 3, 14, 12};
		int len=array.length;
		MergeSort ms=new MergeSort();
		ms.sort(array,0,len-1);
	}

}
