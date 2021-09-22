import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class Treeset 
{

    public static void main(String[] args) 
    {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
          tSet.add(780);
            tSet.add(53);
              tSet.add(909);
        tSet.add(4);
        tSet.add(30);
        tSet.add(29);
        tSet.add(15);
        tSet.add(1);

        System.out.println("TreeSet contains: " + tSet);

        /*
         * To get the a reverse order view of this TreeSet, use
         * the descendingSet method
         */
        Set<Integer> reverseSet = tSet.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext())
        {
            System.out.println( itr.next() );
        }
    }
}
