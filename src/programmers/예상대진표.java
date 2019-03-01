package programmers;

public class 예상대진표 
{
	public boolean fightCheck(int a, int b)
	{
		if( a > b && a % 2 == 0 && a - b == 1)
			return true;
		else if( b > a && b % 2 == 0 && b - a == 1)
			return true;
		
		return false;
	}
	
	public int solution(int n, int a, int b)
    {
		int count = 1;
				
		if( fightCheck(a, b))
			return 1;
		
        while(true)
        {
        	count++;
        	
        	if( a / 2 >= 1)
        	{
        		a =  (a / 2) + (a % 2);
        	}
        	
        	if( b / 2 >= 1)
        	{
        		b =  (b / 2) + (b % 2);
        	}
        	
        	if( fightCheck(a, b))
            {
        		//System.out.println("count : " + count);
            	return count;
            }	
        	
        }
    }
	
	public static void main(String[] args) 
	{
		예상대진표 a = new 예상대진표();
		for (int i = 0; i < 10; i++)
		{
			int r1 = (int)(Math.random() * 100) + 1;
			int r2 = (int)(Math.random() * 100) + 1;
			
			System.out.println();
			System.out.println("r1 : " + r1);
			System.out.println("r2 : " + r2);
			System.out.println();
			
			a.solution(1048576, r1, r2);
			//a.solutions(1048576, r1, r2);
		}
		
		//a.solution(1048576, 1, 9);
		//a.solutions(1048576, 1, 9);
	}

}
