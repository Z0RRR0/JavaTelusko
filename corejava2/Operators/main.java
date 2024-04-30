class main
{
    public static void main(String args[])
    {
        int num1 = 7;
        int num2 = 5;

        // int result = num1 % num2;
        // int result = num1 + num2;
        // int result = num1 - num2;
        // int result = num1 * num2;
        // int result = num1 / num2;

        // num1 += 2;
        // num1 *= 2;
        // num1 %= 2;
        // num1 /= 2;
        // num1 -= 2;

        // num1++;     //post - increment
        // ++num1;     //pre - increment
        // num1--;

        // int result = ++num1;    //first increment then feetch the value
        int result = num1++;    //fetch the value then increment

        System.out.println(result);
    }
}