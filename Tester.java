import java.util.*;

/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class Tester
{
    public void testLogEntry() 
    {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() 
    {
        // complete method
    }
}
