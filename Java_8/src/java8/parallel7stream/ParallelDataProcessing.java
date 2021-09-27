package java8.parallel7stream;

/*
 Parallel Data Processing in Java | Set 1

 Last Updated : 02 Nov, 2017

We know that new Stream in Java (introduced in Java 8) 
interface let us manipulate collections of data in a declarative way.
In this topic, we will discover how the Stream interface gives 
us the opportunity to execute operations in parallel on a collection 
of data without much effort. It lets us declaratively 
turn a sequential stream into a parallel one

Definition and Making into Parallel Streams:
A parallel stream is one that splits the elements 
into multiple streams and assigns them into multiple 
chunks on different threads. Thus we can divide the workload 
of a given operation on the core of multiprocessors and thus 
it will make the CPU busy. We can convert the stream into 
parallel by attaching the keyword ‘parallel’.

Following example just gives us the idea how we can convert a stream into a parallel one!
 */


//A Simple Java program to demonstrate parallel 
//processing. 
import java.util.stream.*; 

public class ParallelDataProcessing {
 
	static long sumparallel(long n) 
	{ 
		// Stream converted to parallel stream 
		return Stream.iterate(1L, i->i + 1). 
					limit(n).parallel(). 
					reduce(0L, Long::sum); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		long c = sumparallel(10); 
		System.out.println("Sum is " + c); 
	} 
} 

