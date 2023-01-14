package com.info.logical;

public class P4 {

	public static void main(String[] args) {
		
		int arr1[]={10,200,40,50};
		
		int temp;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
					{
						temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;		
					}
			}
		}	
			System.out.println(arr1[2]);
	}
}
