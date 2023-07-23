import java.util.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(ischeck(input));
        }
        
    }
       public static boolean ischeck(String input)
    {
        //Complete the code
            Stack<Character> s=new Stack<Character>();
            for(int i=0;i<input.length();i++)
            {
                Character a=input.charAt(i);
                if(a=='{' || a=='(' || a=='[')
                    s.push(a);
                if(s.empty())
                    return false;
                else if((a=='}' && s.peek()=='{')||(a==')' && s.peek()=='(') || (a==']'  && s.peek()=='['))
                    s.pop();
            }
            if(s.empty())
                return true;
            return false;
    }
    
}