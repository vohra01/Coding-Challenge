package kunal.Main;

public class hhhhh
{ 
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B"); 
        }  
        finally 
        {
            System.out.print("C"); 
        }  
        System.out.print("D"); 
    }  
    public static void badMethod() {} 
} 
