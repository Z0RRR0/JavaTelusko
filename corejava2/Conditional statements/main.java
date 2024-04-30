// Conditional Statement (if, else)


// EG:1


// class main
// {
//     public static void main(String args[])
//     {

//         int x = 8;

//         // if(x<10 && x==8)
//         //     System.out.println("Hello");
        
//         // System.out.println("Bye");

//          if(x<10 && x==8)
//             System.out.println("Hello");
//         else
//             System.out.println("Bye");



//     }
// }


// EG:2

// class main
// {
//     public static void main(String args[])
//     {

//         int x = 8;
//         int y = 9;
        
//         if(x>y)
//         System.out.println(x);
//         else
//         System.out.println(y);



//     }
// }


// EG:3

// class main
// {
//     public static void main(String args[])
//     {

//         int x = 8;
//         int y = 9;
        
//         if(x<=y)
//         {
//             System.out.println(x);
//             System.out.println("Thank you");
//         }    
//         else
//             System.out.println(y);



//     }
// }


// EG:4

// class main
// {
//     public static void main(String args[])
//     {

//         int x = 8;
//         int y = 9;
//         int a = 8;

//         if(x<=y && a!=x)    //false
//         {
//             System.out.println(x);
//             System.out.println("Konichiwa");
//         }    
//         else
//         {
//             System.out.println(y);
//             System.out.println("Sayonara");
//         }


//     }
// }




//EG:5

// class main
// {
//     public static void main(String args[])
//     {

//         int x = 8;
//         int y = 17;
//         int a = 9;

//         if(x>y && x>a)    //false
//             System.out.println(x);
//         else if(y>a)
//             System.out.println(y);
//         else    
//             System.out.println(a);


//     }
// }





class main
{
    public static void main(String args[])
    {
        int n = 5;
        int result = 0;


        // if(n%2==0)
        // result = 10;
        // else
        // result = 20;         //Instead of doing this we can also use: 
 
        // ?:     TERNARY OPERATOR

        result = n%2==0 ? 10 : 20;

        System.out.println(result);



    }
}