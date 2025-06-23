/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

Constraints:
    1 <= num1.length, num2.length <= 200
    num1 and num2 consist of digits only.
    Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/
import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the two numbers: ");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        int result[] = new int[num1.length()+num2.length()];
        for(int i = num2.length()-1; i>=0; i--){// we need to iterate backwards to immitate the multiplication irl.
            for(int j = num1.length()-1;j>=0;j--){// we need to iterate backwards to immiatte the multiplication irl.
                int place = i+j+1;
                int product = (num1.charAt(j)-'0')*(num2.charAt(i)-'0')+ result[place];
                result[place]= product%10;
                result[place -1] += product/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while(start<result.length-1 && result[start]== 0){
            start ++;//skipping zeroes
        }
        for(int k = start; k<result.length; k++){
            sb.append(result[k]);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}