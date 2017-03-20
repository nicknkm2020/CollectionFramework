package TreeMapExampleDescendingEmpIoyeeIdComparator;
import java.util.Comparator;

public class DescendingEmpIoyeeIdComparator implements Comparator<Integer>
{

    /*
     * This method used to arrange the employeeId's in descending order.
     */
    @Override
    public int compare( Integer employeeId1, Integer employeeId2 )
    {
/*        if( employeeId1 < employeeId2 )
        {
            
            return 1;
        }
        else
        {
            return -1;
        }*/
        
        return -employeeId1.compareTo(employeeId2);
    }

}
