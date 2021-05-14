import java.util.*;
class WordSearch
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
	String word = "CCFS";
	int i=0,j=0;
	while(true)
	{
		if(j==board.length)
		{
			j=0;
			i++;
		}
		if(board[i][j]==word.charAt(0))
		{
			System.out.println(checkString(board,word,i,j));
		  
			break;
		}
		j++;
		}
  }
  public static boolean checkString(char board[][],String word,int i,int j)
  {
		for(int m=1;m<word.length();m++)
		{
			if(i>=0&&i<board.length&&j>=0&&(j+1)<=board.length&&word.charAt(m)==board[i][j+1])
			{
				System.out.println("true1");
				j=j+1;
			}
			else if(i>=0&&i<board.length&&(j-1)>=0&&j<=board.length&&word.charAt(m)==board[i][j-1])
			{
				System.out.println("true2");
				j=j-1;
			}
			else if(i>=0&&(i+1)<board.length&&j>=0&&j<=board.length&&word.charAt(m)==board[i+1][j])
			{
				System.out.println("true3");
				i=i+1;
			}
			else if((i-1)>=0&&i<board.length&&j>=0&&(j+1)<=board.length&&word.charAt(m)==board[i-1][j])
			{
				System.out.println("true4");
				i=i-1;
			}
			else
			{
				return false;
			}
		}
		return true;
  }
		
}
