package kunal.Main;

enum Languages
{
    Python(10), Java(9), Angular(12);
    private int coders; 

    Languages(int p)
    {
         coders = p;
    }

    int getcoders()
    { 
        return coders; 
    }
}

class HackerEarth1
{
    public static void main(String args[])
    {
        Languages ap;
       
        for(Languages a : Languages.values())
        System.out.println(a + " " + a.getcoders() +" coders.");
    }
}
