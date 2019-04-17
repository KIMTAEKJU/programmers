package programmers;

import java.util.*;

public class 라면공장 
{
	public int solution(int stock, int[] dates, int[] supplies, int k) 
	{		
		HashMap<Integer, Integer> map = new HashMap<>();

		int remainingDate = k;
		int supplyCount = 0;

		for( int i = 0; i < dates.length; i++)
		{
			map.put(dates[i], supplies[i]);
		}

		Iterator it = sortByValue(map).iterator();
		for(int i = 0; i < dates.length; i++)
		{
			if( it.hasNext())
				dates[i] = (int)it.next();
		}

		while(true)
		{
			if( remainingDate > stock)
			{
				for(int i = 0; i < dates.length; i++)
				{
					if( stock - dates[i] >= 0)
					{
						stock += map.get(dates[i]);
						dates[i] = 100000;
						supplyCount++;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
			
		return supplyCount;
	}

	public static List sortByValue(final Map map)
	{
		List<String> list = new ArrayList();
		list.addAll(map.keySet());

		Collections.sort(list,new Comparator()
		{
			public int compare(Object o1,Object o2){
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v1).compareTo(v2);
			}
		});
		Collections.reverse(list); // 주석시 오름차순
		return list;
	}

	public static void main(String[] args) 
	{
		라면공장 a = new 라면공장();
		a.solution(4, new int[] {4, 10, 15}, new int[] {20, 5, 10}, 30);
	}

}
