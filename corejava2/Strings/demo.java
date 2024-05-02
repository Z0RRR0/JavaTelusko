// Strings

// luffy

public class demo
{
    public static void main(String a[])
    {
        // // String name = new String("luffy");
        // String name = "zoro";
        // name = name + " roronoa";
        // System.out.println("hello " + name);

        // String s1 = " Zoro";
        // String s2 = " Zoro";
        
        // System.out.println(s1 == s2);



        StringBuffer sb = new StringBuffer("Luffy");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        sb.append(" Zoro");

        System.out.println(sb);

        // String str = sb.toString(); //to change stringbuffer to string

        // sb.deleteCharAt(2);
        // sb.insert(0, "Merry " );
        // sb.setLength(30);
        // sb.ensureCapacity(100);

        System.out.println(sb);

    }
}