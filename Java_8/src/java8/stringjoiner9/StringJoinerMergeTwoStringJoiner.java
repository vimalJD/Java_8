package java8.stringjoiner9;


/*
StringJoiner Example: Merge Two StringJoiner

The merge() method merges two StringJoiner objects excluding of prefix and suffix of second StringJoiner object.
*/
      
    import java.util.StringJoiner;  
    
    public class StringJoinerMergeTwoStringJoiner {

    
      
        public static void main(String[] args) {  
      
            StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
              
            // Adding values to StringJoiner  
            joinNames.add("Rahul");  
            joinNames.add("Raju");  
      
            // Creating StringJoiner with :(colon) delimiter  
            StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
              
            // Adding values to StringJoiner  
            joinNames2.add("Peter");  
            joinNames2.add("Raheem");  
      
            // Merging two StringJoiner  
            StringJoiner merge = joinNames.merge(joinNames2);   
            System.out.println(merge);  
        }  
    } 
