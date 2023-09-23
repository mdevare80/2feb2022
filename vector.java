
import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          
          Vector<String> vec = new Vector<String>(4);  
          
          vec.add("AKM");  
          vec.add("M249");  
          vec.add("MK14");  
          vec.add("M416"); 
          
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity());  
          
          System.out.println("Vector element is: "+vec);  
          vec.addElement("Erangle");  
          vec.addElement("Livik");  
          vec.addElement("Vikendi"); 
           
          System.out.println("Size after addition: "+vec.size());  
          System.out.println("Capacity after addition is: "+vec.capacity());  
          
          System.out.println("Elements are: "+vec);  
                 
            if(vec.contains("Livik"))  
            {  
               System.out.println("Livik is present at the index " +vec.indexOf("Livik"));  
            }  
            else  
            {  
               System.out.println("Livik is not present in the list.");  
            }  
            
          System.out.println("The first gun of the vector is = "+vec.firstElement());   
          
          System.out.println("The last map of the vector is = "+vec.lastElement());   
       }  
}
