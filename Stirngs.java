public class Stirngs
{
    public static void main(String args[])
    {
        // method-1 assigning a group of charecters enclosed by double quotes to string variable
        String s="java";

        // method-2 defing String object

        String s2=new String("Hello");

        // method-3 Defining the String using the array of charecters

        char arr[]={'a','d','i','t','y','a'};
        String s3=new String(arr);

        System.out.println("String by method1: "+s);
        System.out.println("Stirng by method2: "+s2);
        System.out.println("String by method3: "+s3);

        

    }
}