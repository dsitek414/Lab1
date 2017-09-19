
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.Scanner;
import java.util.Vector;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.io.File;
import java.io.IOException;

public class Lab1b {
    
    // data members

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
     @author Daniel Sitek
     @since 8/29/17
     @version 1.7.0
    */
    public Lab1b(String filename) 
    {
    	readFile("Lab1b.dat");
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename)
    {
    	try
    	{
    		File inputFile = new File(filename);
    		Scanner input = new Scanner(inputFile);
    		int numItems = 0; // counts how many doubles exist in the file
    		double avg = 0.0, total = 0.0; // avg is the average of all doubles and total is the sum of all the doubles
    		while (input.hasNext() == true) // count number of doubles and add up all the values
    		{
    			numItems++;
    			total += input.nextDouble(); // adds up the doubles
    		}
    		avg = total / numItems; // calculates the average
    		
    		System.out.printf("There are %d doubles in the input file:\n", numItems);
    		System.out.printf("The sum of all doubles is %f:\n", total);
    		System.out.printf("The average of all values in the input file is %f\n", avg);
    		input.close();
    	}
    	catch (IOException e) 
        {
        		System.err.println("IOException in reading input file!!!");
        }	
    }
    //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) 
    {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
