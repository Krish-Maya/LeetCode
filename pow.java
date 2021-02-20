class pow {
    public double myPow(double x, int n) {
        
        double r= Math.pow(x,n);
        return r;
    }


public static void main ( String[] a)
{
    pow s= new pow();
  double n=2.00000;
  int p=-2;
  double res=s.myPow(n,p);
  System.out.printf("%f%n",res);
  }
  }