package java8.references2staticmethod;

public class StaticMethodRunnable {

      
        public static void ThreadStatus(){  
            System.out.println("Thread is running...");  
        }  
        public static void main(String[] args) {  
            Thread t2=new Thread(StaticMethodRunnable::ThreadStatus);  
            t2.start();       
        }  
      
	
	
}
