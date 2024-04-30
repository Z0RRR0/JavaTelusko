//Array

// class main
// {
//     public static void main(String a[])
//     {
//             int nums[] = new int[4];
//             nums[0] = 4;
//             nums[1] = 8;
//             nums[2] = 3;
//             nums[3] = 9;


//             // System.out.println(nums[0]);
//             // System.out.println(nums[1]);
//             // System.out.println(nums[2]);
//             // System.out.println(nums[3]);

//             for(int i = 0; i <=3; i++)
//             {
//             System.out.println(nums[i]);
//             }
//         }
// }




//Array of array is called Multi-Dimensional Array.





class main
{
    public static void main(String a[])
    {
        // int nums[][] = new int[3][4];             //2D array
        // int nums[][] = new int[3][4][5];          //3D array
        int nums[][] = new int[3][];                 //jagged array

        
        nums[0] = new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];
    
        

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                // System.out.println(nums[i][j]);
            }
        }

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

// Enhanced For Loop:

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");

            }
            System.out.println();
        }

    }
}



