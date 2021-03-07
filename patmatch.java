class patmatch
{
public static void main ( String[] args)
{
String str="aab";
String pat="a*b";
Solution s = new Solution();
boolean b= s.isMatch(str,pat);
System.out.println("result"+ b);
}


}
class Solution
{

public boolean isMatch(String s, String p)
 {
int num=p.length()+1;
int nums=s.length()+1;
boolean dp[][]=new boolean[nums][num];

dp[0][0]=true;

for(int i=1;i<=s.length();i++)
{
 dp[i][0]=false;
}
for(int i=1;i<=p.length();i++)
 {
 if(p.charAt(i-1) == '*')
   {
 dp[0][i]=true;
   }
 else
   {
 dp[0][i]=false;
    }
  }
 for(int i=1;i<=s.length();i++)

 {

 for(int j=1;j<=p.length();j++)

 {

 if(s.charAt(i-1) == p.charAt(j-1))
 {
 dp[i][j]=dp[i-1][j-1];
 }
 else if('?' == p.charAt(j - 1) || s.charAt(i - 1) == p.charAt(j - 1))
 {
 dp[i][j]=dp[i-1][j-1];
 }
 else if(p.charAt(j-1) == '*')
 {
 dp[i][j]=dp[i - 1][j] || dp[i][j - 1];
 }
 else if(p.charAt(j-1) == '+')
  {

 if(p.charAt(j-2) == s.charAt(i-1))

 {

 dp[i][j]=true;

 }

 else

 {

 dp[i][j] =false;

 }

 }

 else

 {

 dp[i][j] =false;

 }

 }

 }
 for ( int i=0;i<=s.length();i++)
 {
	 for ( int j=0;j<=p.length();j++)
	 {
		 System.out.print(dp[i][j]+" ");
	 }
	 System.out.println(" ");
 }
 if(dp[s.length()][p.length()])
 {
 return true;
 }
 else
 {
 return false;
 }
}
}
