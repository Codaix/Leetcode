/*REVERSE INTEGER
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Q10 {
    public int reverse(int x){
        int sign = x<0?-1:1;
        x = Math.abs(x);
        int num =0;
        while(x>0){
        int digit =x%10;
        if(num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10 && digit>7)){
            return 0;
        }
        if(num<Integer.MIN_VALUE/10||(num==Integer.MIN_VALUE/10&&digit< -8)){
            return 0;
        }
        num = num*10 + digit;
        x = x/10;
        }
        return num*sign;
    }

    
}
