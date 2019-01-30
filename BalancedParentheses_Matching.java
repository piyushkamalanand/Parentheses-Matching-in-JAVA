package rank;
import java.util.*;
public class BalancedParentheses_Matching 
{
	public static void main(String args[])
	{
		BalancedParentheses_Matching b=new BalancedParentheses_Matching();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The String - ");
		String s=sc.next();
		boolean bb=b.CheckParentheses(s);
		if(bb==true)
		{
			System.out.println(" Balanced ");
		}
		else
		{
			System.out.println(" Not Balanced ");
		}
	}
	public boolean CheckParentheses(String s)
	{
		char x;
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
			{
				st.push(i);
			}
			if(st.isEmpty())
			{
				return false;
			}
			switch(s.charAt(i))
			{
			case ')':
			{
				//x=(char) st.peek();
				//st.pop();
				if(st.peek()=='{' || st.peek()=='[')
				{
					return false;
				}
				st.pop();
				break;
			}
			case '}':
			{
				//x=(char) st.peek();
				//st.pop();
				if(st.peek()=='(' || st.peek()=='[')
				{
					return false;
				}
				st.pop();
				break;
			}
			case ']':
			{
				//x=(char) st.peek();
				
				if(st.peek()=='{' || st.peek()=='(')
				{
					return false;
				}
				st.pop();
				break;
			}
			}
		}
		return st.isEmpty();
	}
}
