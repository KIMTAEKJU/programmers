package programmers;

public class 주식가격 {

	public int[] solution(int[] prices) 
	{
        int[] result = new int[prices.length];
        
        for( int i = 0; i < prices.length; i++)
        {
        	int count = 0;
        	
        	for( int j = i + 1; j < prices.length; j++)
        	{
    			count++;
    			
        		if( prices[i] > prices[j])
        		{
        			break;
        		}
        	}
        	
        	result[i] = count;
        }
        
        for( int i = 0; i < result.length; i++)
        	System.out.print(result[i] + " ");
        System.out.println();
        
        return result;
    }
	
	public static void main(String[] args) {
		주식가격 a = new 주식가격();
		a.solution(new int[] {498, 501, 470, 489});
	}

}
