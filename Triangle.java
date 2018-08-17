/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int rows=7;
		for (int i = 1; i <= rows; i++) 
		{
            for (int j = 1; j <= i; j++) { 
            	System.out.print("#"); 
                } 
                System.out.println(); 
        } 
  
        for (int i = rows-1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("#");
                }
                System.out.println();
        }	
	
	}
}