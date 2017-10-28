package com.sort;

		import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class FileParsing {

	public static void main(String[] args) throws IOException {
		
				
				FileReader fileReader =  new FileReader("C://Users//Owner//Desktop//a.txt");

		            
		            BufferedReader bufferedReader = 
		                new BufferedReader(fileReader);
		            
		            String line;
		        
		        
		            HashMap<String,Integer> hm=new HashMap<String,Integer>();  
		            while((line = bufferedReader.readLine()) != null)
		            {
		            	String[] array=line.split("\\s+");
		            	if(hm.containsKey(array[0]))
		            	{
		            		int count=hm.get(array[0]);
		            		count++;
		            		hm.put(array[0],count);
		            		
		            	}
		            	else
		            	{
		            		hm.put(array[0],1);
		            	}
		            	  
		            	  
		              
		            }
		            
		            
		           
		            FileWriter f0 = new FileWriter("C://Users//Owner//Desktop//records.txt");

		            String newLine = System.getProperty("line.separator");


		            for(String key:hm.keySet())
		            {
		                f0.write(key +" : "+ hm.get(key) + newLine);
		                System.out.println(key +" : "+ hm.get(key));
		            }
		            f0.close();
		          
			}
		
// TODO Auto-generated method stub

	

}
