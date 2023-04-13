import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



        //print
        System.out.println(list);



        //get elements
        int elements = list.get(0);
        System.out.println(elements);



        //add element in between
        list.add(1, 0);
        System.out.println(list);



        //set element
        list.set(0, 6);
        System.out.println(list);



        //delete element
        list.remove(3);
        System.out.println(list);



        //size
        int size = list.size();
        System.out.println(size);



        //loop
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");    
        }
        System.out.println();



        //sort the arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}