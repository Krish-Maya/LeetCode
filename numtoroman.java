import java.util.*;
class numtoroman 
{
    public static final String Empty="";
	public static  String suffix="";
    public static final String x[]={ Empty,"M","N","C","L","X","V","I"};
	
	public static String convert(int number,int c,String suf)
	{
	    String tt= x[c];
		for ( int i=0;i<number;i++)
		{
		    suf=suf+tt;
			}
			
	   return suf;
	}
	
	
	
	
	
    public String intToRoman(int num)
	{
	int n=1000,m=500;
	 int count=1;
	 if (num==4)
	 {
		 suffix=suffix+"IV";
		 return suffix;
	 }
	  while(n!=0)
	  {
		  int tem= num/n;
	   suffix= convert( tem,count,suffix);
	    num=num%n;
		if(n==1)
		break;
		n=n/10;
		count++;
		tem=num/m;
		suffix=convert( tem,count,suffix);
		num=num%m;
		m=m/10;
		count++;
	  }
	  return suffix;
        
    }
	public static void main ( String[] args)
	{
	  numtoroman s= new numtoroman();
	  Scanner sc = new Scanner(System.in);
	  int n= sc.nextInt();
	  String res= s.intToRoman(n);
	  System.out.println("Roman Latter:"+res);
	
}
}