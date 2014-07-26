package sample;

import java.util.Stack;

public class stackTest {

	public static void main(String[] args) {
		
		
		Stack st;
		int sum=0;
		int numb=5;
		int x;
		
		st=new Stack<>();
		 try{
		numb=Integer.parseInt(args[0]);
		System.out.println(numb);
		}catch(NullPointerException ne){System.out.println("error");}
		System.out.println("Summation of" + numb);
		
		
		while(numb>0)
			{
			st.push(numb);
			numb--;
			}
		System.out.println(st);
		
		while(!st.isEmpty())
		{
		   sum +=(int) st.pop();
		   	
		
		}
		System.out.println(sum);
				
		

	}

}
