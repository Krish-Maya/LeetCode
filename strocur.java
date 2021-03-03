class strocur
{
  public static void main( String[] args)
  {
    String str1="test12";
	String str2="1234";
	int n=checkstring(str1,str2);
	System.out.println("number"+n);
	}
	public static int checkstring(String s1,String s2)
	{
	int i=0,k=0,t1,t2;
	boolean b=false;
	    
		while(s1.charAt(i)!=s2.charAt(0))
		{
		  i++;
		
		}
		t1=i;
		while(k<s2.length() && i<s1.length()&& s1.charAt(i)==s2.charAt(k))
		{
		   i++;
		   k++;
		  b=true;
		}
		
		t2=i-t1;
		if(b && s2.length()==t2)
		{
		return t1;
		}
		else
		{
		return -1;
		}
		}
		}
	
	    