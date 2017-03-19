package LinkedHashMapExample;
import java.util.LinkedHashMap;

/*
 * Example of size() method.
 */
public class LinkedHashMapExample7
{
    public static void main( String[] args )
    {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(3, "Cat");
        linkedHashMap.put(2, "Ball");

        System.out.println("linkedHashMap : " + linkedHashMap + "\n");

        /*
         * Returns the number of key-value mappings in this map.
         */
        int size = linkedHashMap.size();
        System.out.println("size : " + size);

    }
}