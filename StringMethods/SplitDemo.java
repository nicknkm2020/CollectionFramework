package StringMethods;
public class SplitDemo
{

    public static void main(String[] args)
    {
        String str = "Peter,Welcome,to,India";
        String strArray[] = str.split(",");
        for (String string : strArray)
        {
            System.out.println(string);
        }
        System.out.println("----------------------");
        str = "Peter,Welcome,to,India";
        String strArray2[] = str.split(",", 3);
        for (String string : strArray2)
        {
            System.out.println(string);
        }

    }
}