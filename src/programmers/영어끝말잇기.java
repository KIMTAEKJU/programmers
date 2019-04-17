package programmers;

import java.util.HashMap;
import java.util.Map;

public class 영어끝말잇기
{
	public int[] solution(int n, String[] words) 
	{
		Map<String, Integer> map = new HashMap<>();
		char lastChar = words[0].charAt(0);
		int wordsIndexCount = 0;
		
	first: for( int i = 1; i < 100; i++)
		{
			for( int j = 1; j <= n; j++)
			{
				if( map.containsKey(words[wordsIndexCount]) == false && lastChar == words[wordsIndexCount].charAt(0))
				{
					map.put(words[wordsIndexCount], 0);
					lastChar = words[wordsIndexCount].charAt(words[wordsIndexCount].length() - 1);
					wordsIndexCount++;
					
					if( wordsIndexCount == words.length)
					{
						break first;
					}
				}
				else
				{
					return new int[] {j, i};
				}
			}
		}
		
		return new int[] {0, 0};
    }
	
	public static void main(String[] args) 
	{

	}

}
