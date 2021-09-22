
import java.util.*;
import java.io.*;
class ArrayListDemo
{
   public static void main(String args[])
   {
      //create an ArrayList
      ArrayList<String> fruits_List=new ArrayList<String>();
      //add elements to the ArrayList using add method
      fruits_List.add("Apple");
      fruits_List.add("Banana");
      fruits_List.add("Orange");
      fruits_List.add("Kiwi");
      //print the list
      System.out.println("Initial ArrayList:" + fruits_List);
      //add an element at index 1 using add method overload
      fruits_List.add(1, "Sapota");
      //print the list
      System.out.println("\nArrayList after adding an element'Sapota at index 1:" + fruits_List);
      //define a second list
      ArrayList<String> more_fruits = new ArrayList<String>(Arrays.asList("Grapes", "Watermelon","Cherry","Berries"));
      //use addAll method to add the list to ArrayList at index 4
      fruits_List.addAll(4,more_fruits);
      //print the list
      System.out.println("\nArrayList after adding all list at index 4:" + fruits_List);
      fruits_List.remove(2);

      System.out.println("\nArrayList after removing element at index 2:" + fruits_List);
 //remove the element "Kiwi"
      fruits_List.remove("Kiwi");

      System.out.println("\nArrayList after removing element 'Kiwi':" + fruits_List);
      fruits_List.removeAll(more_fruits);

     System.out.println("\nArrayList after call to removeAll from array 'more_fruits':" + fruits_List);
     //print the size of ArrayList

       System.out.println("ArrayList Size: "+fruits_List.size());
       fruits_List.add("Kiwi");
       fruits_List.add("Mulberry");
       fruits_List.add("Blackberry");
       fruits_List.add("Mangustein");
           System.out.println("\nArrayList after adding some elements:" + fruits_List);

fruits_List.trimToSize();
        //print the size of ArrayList
        System.out.println("ArrayList Size after trimToSize() operation: "+fruits_List.size());
        //call indexOf() and lastIndexOf() methods to check the indices of specified elements
     System.out.println("indexOf(Blackberry) : " + fruits_List.indexOf("Blackberry"));
     System.out.println("lastIndexOf(Blackberry) : " + fruits_List.lastIndexOf("Blackberry"));
     fruits_List.clear();
     System.out.println("ArrayList after clearing all elements: "+fruits_List);


   }
}