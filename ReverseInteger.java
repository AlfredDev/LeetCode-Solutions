
public class ReverseInteger
{
    static public int reverse(int x) {
      if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE ) return 0;
        
        int pop, temp;
        int rev = 0;
        
        while(x != 0){
            pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            
        }
                
       return rev;
    }
     
}
