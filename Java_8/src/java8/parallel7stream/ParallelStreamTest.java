package java8.parallel7stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/*
 1. Using parallel() method on a stream

The parallel() method of the BaseStream interface 
returns an equivalent parallel stream. 
Let us explain how it would work with the help of an example.

 In the code given below, we create a file object which points 
 to a pre-existent txt file in the system. Then we create a Stream 
 that reads from the text file one line at a time. 
 Then we use the parallel() method to print the read file on the console. 
 The order of execution is different for each run, 
 you can observe this in the output. 
 The two outputs given below have different orders of execution.
 */

public class ParallelStreamTest {

	public static void main(String[] args) throws IOException { 
		  
        // Create a File object  
        File fileName = new File("H:\\Java8_Workspace\\Java_8\\src\\java8\\parallel\\stream\\Textfile.txt"); 
          
        // Create a Stream of String type 
        // Using the lines() method to read one line at a time 
        // from the text file 
        Stream<String> text = Files.lines(fileName.toPath()); 
          
        // Use StreamObject.parallel() to create parallel streams 
        // Use forEach() to print the lines on the console 
        text.parallel().forEach(System.out::println); 
          
        // Close the Stream 
        text.close(); 
    } 
	
}
