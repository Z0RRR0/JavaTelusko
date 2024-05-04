class ques2 
{
    public static void main(String args[])
    {

        int[] arr = {2, 7, 11, 15}; 
        
        int sum = 0;
        int target = 22;

        for(int j=0; j<arr.length; j++)
        {
             for(int i = j+1; i<arr.length; i++)
            {
                sum = arr[i]+arr[j];
                // System.out.println(sum);
                if(sum==target)
                {
                    System.out.println(i + " " + j);
                }
            }
        }
        // System.out.println(sum);

    }
        
        

    

}