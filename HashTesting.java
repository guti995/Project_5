import java.util.Scanner;
import java.io.*;


public class HashTesting {

public static void main (String [] args) throws IOException{ 
   
    Table t = new Table (31);
   
    String[] lineArray = null; 
    File names = new File ("names.txt"); 
    Scanner scan = new Scanner (names); 
    double averageAttempts = 0;
    int j = 1;
    
// Places all names/data into the table
    
    while (scan.hasNextLine ()) { 
       String fileline = scan.nextLine();
       lineArray = fileline.split(" ");
       
       t.put (lineArray [1], lineArray [0]);
       averageAttempts += t.getCounter();
       
       System.out.print ("Attempt # " + j + " has " + t.getCounter() + " collsions\n");
       j++;
       
       }
       System.out.println (t.output());
       scan.close();
       
       System.out.println ("This is the linear average attempts: " + averageAttempts / 25);
       System.out.println (averageAttempts);
       
}
         


    
}