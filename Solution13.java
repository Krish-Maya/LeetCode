class Solution13
 {
		
        public int romanToInt(String s) {
        int value = 0;
        char current;
        char previous = '0';
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (i != 0) {
                previous = s.charAt(i - 1);
            }
            
            switch (current) {
                case 'I':
                    value++;
                    break;
                case 'V':
                    value += 5;
                    if (previous == 'I')
                        value -= 2;
                    break;
                case 'X':
                    value += 10;
                    if (previous == 'I')
                        value -= 2;
                    break;
                case 'L':
                    value += 50;
                    if (previous == 'X')
                        value -= 20;
                    break;
                case 'C':
                    value += 100;
                    if (previous == 'X')
                        value -= 20;
                    break;
                case 'D':
                    value += 500;
                    if (previous == 'C')
                        value -= 200;
                    break;
                case 'M':
                    value += 1000;
                    if (previous == 'C')
                        value -= 200;
                    break;
            }
        }
        
        return value;
    }
    public static void main( String[] args)
    {
        Solution13 s= new Solution13();
        String str="IV";
        System.out.println("result "+s.romanToInt(str));
    }
}