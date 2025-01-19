public class Methods {

    public static void main(String args[])
    {
        String s="Adithya Sai";
        String s1="Vidivada";

        // to concantinate two strings
        String s2=s.concat(s1);
        System.out.println("After cncantination: "+s2);

        // to get the length of the string
        System.out.println("the length of the string is "+s.length());

        // to reetrive the charecters we have charAt(i)

        for(int i=1;i<=s.length();i++)
        {
            System.out.print(s.charAt(i-1)+" ");
        }
        System.out.println();

        // to compare two stirngs

        System.err.println("to compare two strings  "+s.compareTo(s1));
        System.out.println("cox".compareTo("battt"));

        // to comare without case sensitive
        System.out.println("Cat".compareToIgnoreCase("Box"));
        System.out.println("cat".compareToIgnoreCase("Box"));

        // equals metid
        System.out.println("Aditya".equals("Aditya"));
        System.out.println("Aditya".equals("aditya"));

        // equalsIgnoreCase()
        System.out.println("AdityaSai".equalsIgnoreCase("adityasai"));

        // startsWith(),endsWith(),indexOf() etc methods
        System.out.println("Starts with"+s.startsWith("Adi"));
        System.out.println("ends with"+s.endsWith("Sai"));

        // to find the indexof
        System.out.println("getting the index:");
        for(int i=1;i<=s.length();i++)
        {
            System.out.println(s.indexOf(s.charAt(i-1)));
        }

        // last index
        System.out.println("last indexes:");
        for(int i=1;i<=s.length();i++)
        {
            System.out.println(s.lastIndexOf(s.charAt(i-1)));

        }

        // to replace acharecter in a string
        String s4=s1.replace('a','o');
        System.out.println("replaced letter:"+s4);
        s1.replace('o','a');

        System.out.println("Back to normal: "+s1);

        // substrings
        System.out.println("the normal substrings are:");
        for(int i=1;i<=s.length();i++)
        {
            System.out.println(s.substring(i-1));
        }

        // for all the possible substrings are
        for(int i=1;i<=s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                System.out.println(s.substring(i-1,j));
            }
        }

        // to convert to the lowercase

        System.out.println("convert to the lowercase:"+"ADITHYA".toLowerCase());

        // to convert to the uppercase

        System.out.println("convert to the uppercase"+"aditya".toUpperCase());

        // to trim the string
        String a="  aditya sai  ";
        System.out.println(a.trim());

        // to split the stirngs
        String fact="Aditya is an incomptent person";
        String sr[];
        sr=fact.split(" ");
        for(int i=1;i<=sr.length;i++)
        {
            System.out.println(sr[i-1]);
        }

    }
    
}
