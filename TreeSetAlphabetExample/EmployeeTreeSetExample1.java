package TreeSetAlphabetExample;
import java.util.TreeSet;

/*
 * Storing user-defined class objects.
 */
public class EmployeeTreeSetExample1
{
    public static void main( String[] args )
    {
        TreeSet<Employeee> treeSet = new TreeSet<Employeee>();

        Employeee john = new Employeee("John", 20, 40000);
        Employeee david = new Employeee("David", 10, 80000);
        Employeee peter = new Employeee("Peter", 30, 150000);

        System.out.println(john + " is going to be add in treeSet");
        treeSet.add(john);
        
        System.out.println(david + " is going to be add in treeSet");
        treeSet.add(david);
        
        System.out.println(peter + " is going to be add in treeSet");
        treeSet.add(peter);
        

        System.out.println("treeSet : " + treeSet + "\n");
        System.out.println("--------------------------------------------");
        /*
         * Using for each loop getting each employee object from the treeSet
         */
        for( Employeee employee : treeSet )
        {
            System.out.println("Employee Age : "+employee.getAge());
            System.out.println("Employee Name : "+employee.getName());
            System.out.println("Employee Salary :"+ employee.getSalary());
            System.out.println("--------------------------------------------");
        }

    }
}