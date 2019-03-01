package programmers;

import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프린터 
{
	class ValueObject
	{
		private boolean locationCheck;
		private int value;

		public ValueObject(int value) 
		{
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public boolean isLocationCheck() {
			return locationCheck;
		}

		public void setLocationCheck(boolean locationCheck) {
			this.locationCheck = locationCheck;
		}

		@Override
		public String toString() {
			return "ValueObject [locationCheck=" + locationCheck + ", value=" + value + "]";
		}
		
		
	}
	
	public int solution(int[] priorities, int location) 
	{
		ArrayList<ValueObject> list = new ArrayList<>();
		int count = 0;
		
		for (int i = 0; i < priorities.length; i++)
		{
			list.add(new ValueObject(priorities[i]));
		}
		
		list.get(location).setLocationCheck(true);
		
		first: for (int i = 0; i < list.size();)
		{
			int len = list.size();
			
			for (int j = i + 1; j < len; j++)
			{
				if( list.get(i).getValue() < list.get(j).getValue())
				{
					list.add(list.remove(i));
			
					for( ValueObject k : list )
					{
						System.out.println(k);
					}
					System.out.println();
					
					continue first;
				}
			}
			
			count++;
			
			if( list.get(i).isLocationCheck() )
			{
				return count;
			}
			
			list.remove(i);
		}
		
		return 0;
	}
	
	public static void main(String[] args) 
	{
		프린터 a = new 프린터();
		System.out.println(a.solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
	}

}
