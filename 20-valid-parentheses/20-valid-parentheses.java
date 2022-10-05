class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)==')'||s.charAt(0)==(']') ||s.charAt(0)=='}')
            return false;
        
        Stack<Character> open=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{')
            {
                open.push(s.charAt(i));
            }
            else {
                if(open.empty())
                {
                    return false;
                }
                else if(s.charAt(i)==')' )
                {
                    if( open.peek()=='(')
                        open.pop();
                    else
                        return false;
                }
                else if(s.charAt(i)==']')
                {
                   if( open.peek()=='[')
                        open.pop();
                    else
                        return false; 
                }
                else if(s.charAt(i)=='}')
                {
                    if( open.peek()=='{')
                        open.pop();
                    else
                        return false; 
                }
            }
       
        }
        if(!open.empty())
        {
            return false;
        }
        return true;
       
}
}