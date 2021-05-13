import java.util.*;
class AdjacentMatrix {
 
    static void FindMaxProduct(int arr[][])
    {
		int r=arr.length;
		int c=arr[0].length;
        int max = 0, result=0;
        List<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                
                if ((j - 3) >= 0)
                {
                    result = arr[i][j] * arr[i][j - 1]
                             * arr[i][j - 2]
                             * arr[i][j - 3];
							 list.add(result);
                    if (max < result)
					{
                        max = result;
						
					}
                }
 
           
                if ((i - 3) >= 0)
                {
                    result = arr[i][j] * arr[i - 1][j]
                             * arr[i - 2][j]
                             * arr[i - 3][j];
                      list.add(result);
                    if (max < result)
					{
                        max = result;
					}
                }
 
                if ((i - 3) >= 0 && (j - 3) >= 0)
                {
                    result = arr[i][j] * arr[i - 1][j - 1]
                             * arr[i - 2][j - 2]
                             * arr[i - 3][j - 3];
                     list.add(result);
                    if (max < result)
					{
                        max = result;
					}
                }
 
             
                if ((i - 3) >= 0 && (j - 1) <= 0)
                {
                    result = arr[i][j] * arr[i - 1][j + 1]
                             * arr[i - 2][j + 2]
                             * arr[i - 3][j + 3];
                     list.add(result);
                   if (max < result)
					{
                        max = result;
						
					}
                }
            }
        }
		Collections.sort(list,Collections.reverseOrder());
		
		for(int element:list)
		{
			if(!array.contains(element))
			{
				array.add(element);
			}
			
		}
		for(int i=0;i<8;i++)
		{
			System.out.print(array.get(i)+" ");
		}
 
       
    }
 
   
    public static void main(String[] args)
    {
 
 
        int arr[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                        { 6, 7, 8, 9, 1, 2, 3, 4, 5, 0},
                        { 2, 3, 4, 5, 6, 7, 8, 9, 1, 0},
                        { 7, 8, 9, 1, 0, 1, 2, 3, 4, 5},
                        { 9, 6, 4, 2, 3, 4, 5, 6, 7, 1},
                        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                        { 6, 7, 8, 9, 1, 2, 3, 4, 5, 0},
                        { 2, 3, 4, 5, 6, 7, 8, 9, 1, 0},
                        { 7, 8, 9, 1, 0, 1, 2, 3, 4, 5},
                        { 9, 6, 4, 2, 3, 4, 5, 6, 7, 1}
					  };
                   FindMaxProduct(arr);
    }
}
 