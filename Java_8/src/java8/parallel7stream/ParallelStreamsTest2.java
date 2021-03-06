package java8.parallel7stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ParallelStreamsTest2 {

	public static void main(String[] args) throws IOException { 
		  
        // Create a File object 
        File fileName = new File("H:\\Java8_Workspace\\Java_8\\src\\java8\\parallel\\stream\\List_Textfile.txt"); 
  
        // Create a List 
        // Using readAllLines() read the lines of the text file 
        List<String> text = Files.readAllLines(fileName.toPath()); 
          
        // Using parallelStream() to create parallel streams 
        text.parallelStream().forEach(System.out::println); 
    } 
	
}
