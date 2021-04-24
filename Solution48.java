class Solution48 {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
        int c=matrix[0].length;
        int temp[][]=new int[n][c];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j]=matrix[n-j-1][i];
            }
        }  
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        } 
    
        
        
    }
    public static void main (String[] args)
    {
        Solution48 s=new Solution48();
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
       
        
      
        s.rotate(matrix);
    
}
}