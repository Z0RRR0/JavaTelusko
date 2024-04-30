// LOOPS(loop - while, do while, for)


// ********************************* WHILE LOOP *********************************


// class loop
// {
//     public static void main(String args[])
//     {
//         //    System.out.println("Ara-ara");
//         //    System.out.println("Ara-ara");
//         //    System.out.println("Ara-ara");
//         //    System.out.println("Ara-ara");

//         //  repeat this statement 4 times
//         //  loop - while, do while, for 

//         int i = 1;

//         while(i<=4)
//         {
//             System.out.println("Ara-ara " + i);

//             int j =1; 

//             while(j<=3)                  //Nested Loop
//             {
//                 System.out.println("Yametekudasai! aaaaaah!");
//                 j++;
//             }
//             i++;

//         }
//         System.out.println("Sayonara " + i );
//     }
// }


// ***************************** DO-WHILE LOOP *********************************


// class loop
// {
//     public static void main(String args[])
//     {

//         int i = 5;

//         do
//         {
//             System.out.println("Ara-ara " + i);
            
//             i++;
//         }
//         while(i<=4);

//     }
// }




// ***************************** FOR LOOP *********************************


class loop
{
    public static void main(String args[])
    {

                            //INSTEAD OF THIS MUCH! WE CAN

        // int i = 5;     //initialization

        // while(i<=4)         //condition
        // {
        //     System.out.println("Ara-ara " + i); 
            
        //     i++;          //increment
        // }

                        //DO THIS

             //initialization

        // for(int i = 0; i<4; i++)        
        // {
        //     System.out.println("Ara-ara " + i); 
        // }                


        for(int i = 1; i<=5; i++)        
        {
            System.out.println("Day " + i); 

            for(int j = 9; j<12; j++)
            {
                System.out.println(j + " AM " + " - " + (j+1) + " : Just fkin Do your work b*tch!");
            }
            for(int k = 12; k<18; k++)
            {
                System.out.println(k + " PM " + " - " + (k+1) + " : Naruto~Kun~~~");
            }

        }                
        for(int l=6;l<=7;l++)
        {
            System.out.println("Day " + l);
            System.out.println("Yamete~Kudasai! AAaaaahhhh!");
        }
    }
}



// We can either do this for (for loop)-
// i=1;
// for(;i<=5;)
// print statement
// i++;