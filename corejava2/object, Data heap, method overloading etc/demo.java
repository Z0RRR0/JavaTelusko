// Object 


// class Calculator
// {   
//     int a;

//     public int add(int n1, int n2)
//     {
//         int r = n1 + n2;
//         return r;
//     }
//     public int sub(int n1, int n2)
//     {
//         int s = n1 - n2;
//         return s;
//     }
// }

// public class demo
// {
//     public static void main(String []args)
//     {

//         int num1 = 5;
//         int num2 = 4;

//         Calculator calc = new Calculator();

//         int sum = calc.add(num1,num2);
//         int sub = calc.sub(num1,num2);

//         // int result = num1 + num2;

//         System.out.println(sum);
//         System.out.println(sub);

//     }
// }


// Object Oriented Programming
// Object - Properties and Behaviour



// **********************************************OR*************************************************

// This below is also known as Method Overloading.
//local variables are part of the stack and instance variables are the part of heap memory.


class Calculator
{
    int num = 5;    //instance variable

    public int add(int n1, int n2)    //local variables (n1, n2)
    {
        //System.out.println(num);
        return n1 + n2;
    }
//     public double add(double n1, int n2)
//     {
//         return n1 + n2;
//     }
 }

public class demo
{
    public static void main(String a[])
    {
        int data = 10;

        Calculator calc= new Calculator();      //creating an object
        Calculator calc1 = new Calculator();
        // int r1 = calc.add(3,4);                 // calling an object
        
        //System.out.println(r1);

        calc.num=8;

        System.out.println(calc.add(3,4));
        System.out.println(calc.num);
        System.out.println(calc1.num);
    }
}

