package programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 
{
	public int solution(int[] nums) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();		
		int maxGetCount = nums.length / 2;
		
		for( int i = 0; i < nums.length; i++)
		{
			if( map.containsKey(nums[i]) == false && map.size() < maxGetCount)
			{
				map.put(nums[i], 0);
			}
		}
		
		return map.size();
	}
	
	public static void main(String[] args) 
	{


	}

}
