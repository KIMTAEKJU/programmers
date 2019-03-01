package programmers;

import java.util.Stack;

public class 스택_큐_탑 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		스택_큐_탑 a = new 스택_큐_탑();
		int[] b = {3,9,9,3,5,7,2};
		a.solution(b);
	}
	
	public int[] solution(int[] heights) 
    {
		Stack<Integer> stack = new Stack<Integer>();
		int[] answer = new int[heights.length];
		
        first: for (int i = heights.length-1; i >= 0; i--)
        {
        	for (int j = i-1; j >= 0; j--)
        		if (heights[i] < heights[j])
        		{
        			stack.add(j+1);
        			continue first;
        		}
        	
        	stack.add(0);
        }
        
        for (int i = 0; i <= answer.length; i++)
        	answer[i] = stack.pop();        
        
        return answer;
    }

}
