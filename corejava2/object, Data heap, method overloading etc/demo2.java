class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
       
        return "bkl";
    }
}



public class demo2
{
    public static void main(String a[])
    {

        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(20);
        System.out.println (str);


    }
}