class car{
    String name;
    String color;

    public car(String n,String c)
    {
        name=n;
        color=c;
    }
}
public class objects {

    public static void main(String args[])
    {
        car c=new car("Creta","Red");
        System.out.println(c.name+"  "+c.color);
    }
    
}
