package Comparator.EmployeeID.Asc;
import java.util.TreeSet;

/*
 * Example of  TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
    public static void main( String[] args )
    {

        EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();

        /*
         * Constructs a new, empty tree set, sorted according to the specified
         * comparator.
         * 
         * All elements inserted into the set must be mutually comparable by the
         * specified comparator: comparator.compare(e1, e2) must not throw a
         * ClassCastException for any elements e1 and e2 in the set.
         * 
         * If the user attempts to add an element to the set that violates this
         * constraint, the add call will throw a ClassCastException.
         */

        TreeSet<Employee> treeSet = new TreeSet<Employee>(employeeIdComparator);

        Employee john = new Employee(3, "John");
        Employee david = new Employee(2, "David");
        Employee peter = new Employee(1, "Peter");
        Employee juli = new Employee(4, "Juli");        

        treeSet.add(john);        
        treeSet.add(david);        
        treeSet.add(peter);        
        treeSet.add(juli);
        
        //System.out.println("treeSet : " + treeSet + "\n");
        
        System.out.println("-----------------ById------------------");
        for( Employee employee : treeSet )
        {
            System.out.print("Employee ID : "+employee.getEmployeeId());
            System.out.println(" Name : "+employee.getName());
            System.out.println("-----------------------------------");
        }
        
        System.out.println("-----------------ByName------------------");
        
        treeSet = new TreeSet<Employee>(new EmployeeNameComparator());
        
        treeSet.add(john);        
        treeSet.add(david);        
        treeSet.add(peter);        
        treeSet.add(juli);
        
        //System.out.println("treeSet : " + treeSet + "\n");
        
        for( Employee employee : treeSet )
        {
            System.out.print("Employee ID : "+employee.getEmployeeId());
            System.out.println(" Name : "+employee.getName());
            System.out.println("-----------------------------------");
        }
        

    }
}