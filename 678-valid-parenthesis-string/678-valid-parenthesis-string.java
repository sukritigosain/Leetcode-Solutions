class Solution {
    public boolean checkValidString(String s) {
         if(s.charAt(0)==')')
            return false;
        Stack<Integer> open=new Stack<Integer>();
        Stack<Integer> star=new Stack<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open.push(i);
            }
            else if(s.charAt(i)=='*')
            {
                star.push(i);
            }
            else 
            {
                if(!open.empty())
                {
                    open.pop();
                }
                else if(!star.empty())
                {
                    star.pop();
                }
                else
                {
                    return false;
                    
                }
            }
        }
        
        while(!open.empty())
        {
            if(star.empty())
            {
                return false;
            }
            else if(star.peek()>open.peek())
            {
                star.pop();
                open.pop();
            }
            else
            {
                return false;
            }
        }
        return true;
    
}
}