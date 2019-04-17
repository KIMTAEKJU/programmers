package programmers;

public class 가장큰정사각형찾기 
{

	public int rowAndColumnCheck(int x, int y, int[][] board, boolean rowAndColumnCheckBoolean)
	{
		int rowOrColumn = 0;

		first: for( int i = x; i < board.length; i++)
		{
			for( int j = y; j < board[i].length; j++)
			{
				if( board[i][j] == 0)
				{
					break first;
				}
				else
				{
					rowOrColumn++;
				}

				if( rowAndColumnCheckBoolean == true)
				{
					break;
				}
			}
			
			if( rowAndColumnCheckBoolean == false)
			{
				break;
			}
		}

		return rowOrColumn;
	}

	public boolean squareContentCheck(int row, int column, int x, int y, int[][] board)
	{
		for( int i = x; i < row; i++)
		{
			for( int j = y; j < column; j++)
			{
				if( board[i][j] == 0)
					return false;
			}
		}

		return true;
	}

	public int squareCheck(int x, int y, int[][] board, int maxSquare)
	{
		int row = 0;
		int column = 0;
		
		// 행 체크
		row = rowAndColumnCheck(x, y, board, false);

		//열 체크
		column = rowAndColumnCheck(x, y, board, true);

		if( row != column)
		{
			if( row > column)
			{
				row = column;
			}
			else
			{
				column = row;
			}
		}
		
		for( int k = 1; k <= row; k++)
		{
			if( maxSquare < k * k)
			{
				if( squareContentCheck(k + x, k + y, x, y, board) == true)
				{
					maxSquare = k * k;
				}
				else
				{
					break;
				}
			}
		}
		
		return maxSquare;
	}
	
	public int solution(int [][]board)
	{
		int maxSquare = 0;

		for( int i = 0; i < board.length - 1; i++)
		{
			for( int j = 0; j < board[i].length - 1; j++)
			{
				if( board[i][j] == 1)
				{
					if( board[i][j + 1] == 1 && board[i + 1][j] == 1 && board[i + 1][j + 1] == 1 )
					{
						int result = squareCheck(i, j, board, maxSquare);

						if( result > maxSquare)
						{
							maxSquare = result;
						}
					}
				}
			}
		}

		return maxSquare;
	}

}
