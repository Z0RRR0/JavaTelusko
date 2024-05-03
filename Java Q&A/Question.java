//you have given an array you have to print only even number of value in array
//e.g: Array = [12, 345, 45, 6]    
// Output = [12, 45]



class Question
 {
    public static void main(String a[])
    {
        int[] arr = {12, 345, 45, 6, 23};

        
            for(int i= 0; i<arr.length; i++)
            {

                int b = arr[i];
                
                if(String.valueOf(b).length() % 2 == 0)
                {
                    System.out.println(b);
                    
                }
               
             }    

    }
}
