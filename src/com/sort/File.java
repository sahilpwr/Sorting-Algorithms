package com.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
public static void main() throws IOException

	{
		String filename="";
		FileReader fileReader = 
                new FileReader("a.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            String[][] array = null;
            String line;
            int i=0;
            while((line = bufferedReader.readLine()) != null) {
               array[i]=line.split("\\s");
               i++;
               System.out.println(array[i]);
            } 
            
	}
}
