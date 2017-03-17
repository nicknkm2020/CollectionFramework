package LinkedListExample;
import java.util.LinkedList;

/*
 * Example of poll() method
 */
public class LinkedListExample10
{

    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(10000);
        linkedList.add(5000);
        linkedList.add(3000);

        System.out.println("linkedList : " + linkedList + "\n");

        /*
         * Retrieves and removes the head (first element) of this list.
         */
        Integer value = linkedList.poll();
        System.out.println("value : " + value);
        System.out.println("linkedList : " + linkedList + "\n");

    }
}
