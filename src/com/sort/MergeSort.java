package com.sort;

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
		for(int i=0;i<rsize;i++)
		{
			right[i]=array[m+1+i];
		}
		
		int k=l;
		int i=0;
		int j=0;
		while()
		{
			if(left[i]<right[j])
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
		while()
		
	}
	public void sort(int[] array,int l,int r)
	{
		int m =(l+r)/2;
		sort(array, l,m);
		sort(array,m+1,r);
		merge(array,l,r,m);
	}

	public static void main(String[] args) 
	{
		int[] array = {0, 3, 2, 5, 6, 1, 3, 14, 12};
		int len=array.length;

	}

}
