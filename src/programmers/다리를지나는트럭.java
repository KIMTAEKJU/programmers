package programmers;

import java.util.ArrayList;

public class 다리를지나는트럭 
{
	public static int solution(int bridge_length, int weight, int[] truck_weights) 
	{
		int time = 1;
		ArrayList<Integer> bridgeOnTruck = new ArrayList<>();
		ArrayList<Integer> arriveTruckList = new ArrayList<>();
		int len = 0;
		int count = 0;
		int firstWeight = weight;
	    int	index = 0;

		while (arriveTruckList.size() != truck_weights.length)
		{
			System.out.println("i : " + index);
			System.out.println("time : " + time);

			if( index <= truck_weights.length - 1 && weight - truck_weights[index] >= 0)
			{
				weight -= truck_weights[index];
				bridgeOnTruck.add(index);
				count++;
				index++;
			}
			else
			{
				time += bridge_length + (count - 1);
				len = bridgeOnTruck.size();

				for (int j = 0; j < len; j++)
				{
					arriveTruckList.add(1);
				}
				bridgeOnTruck.clear();
				weight = firstWeight;
				index = arriveTruckList.size();

				System.out.println("time : " + time);
				count = 0;

			}
		}


		return time;

	}

	public static void main(String[] args) 
	{
		solution(2, 100, new int[]{7, 4, 5, 6});
	}

}
