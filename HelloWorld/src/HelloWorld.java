/**
 * @author Tobias
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");

		System.out.println("Please enter your name:");
		
		//  open up standard input
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String userName = null;
	    
	    HelloUser userOne = null;

	    //  read the Username from the command-line; need to use try/catch with the
	    //  readLine() method
	    
	    try {
	       userName = br.readLine();
	       userOne = new HelloUser(userName);
	    } catch (IOException ioe) {
	       System.out.println("IO error trying to read your name!");
	       System.exit(1);
	    }

	    userOne.greetUser();		
	}
	


}
