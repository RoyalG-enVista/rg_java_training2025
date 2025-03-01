package Java9;
//java 9 had introduced the concept of private method inside interface
// this act as helper function to dfault method
// java 8 does not support this
// so it does not violate the DRY principle
interface Java8DBLogging
{
    //MODIFIED CODE
    default void logInfo(String message)
    {
        logPrint(message,"Info");
    }

    default void logWarn(String message)
    {
       logPrint(message,"Warn");
    }

    default void logError(String message)
    {
        logPrint(message,"Error");
    }
    private void logPrint(String message,String type)
    {
        // string buffer is used over string
        // to avoid heap pollution
        StringBuffer sb= new StringBuffer(" Setp2: Log" );
        sb.append(type);
        sb.append(" Message");
        sb.append(message);
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(sb);
        System.out.println(" Setp3: Close the DataBase connection");
    }
    //ORIGINAL CODE
//    default void logInfo(String message)
//    {
//        System.out.println(" Step1: Connect to DataBase");
//        System.out.println(" Setp2: Log Info Message");
//        System.out.println("Setp3: Close the DataBase connection");
//    }
//
//    default void logWarn(String message)
//    {
//        System.out.println(" Step1: Connect to DataBase");
//        System.out.println(" Setp2: Log warn Message");
//        System.out.println("Setp3: Close the DataBase connection");
//    }
//
//    default void logError(String message)
//    {
//        System.out.println(" Step1: Connect to DataBase");
//        System.out.println(" Setp2: Log error Message");
//        System.out.println("Setp3: Close the DataBase connection");
//    }

}
class Java8DBLoggingImpl implements Java8DBLogging
{
    // can override the method or default method
    // since we want to test the private function
    // i am not overriding the default method
}
public class A_PrivateMethodInsideInterface
{
    public static void main(String[] args)
    {
        Java8DBLoggingImpl obj=new Java8DBLoggingImpl();
        obj.logInfo("new log");
        obj.logWarn("new log");
        obj.logError("new log");

    }
}
