package onlinevideos;

public class array2d {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int d[][]= 
			{{1,2,3,4},////i=row, j=coloumn
			{5,6,7,8},
			{1,2,3,4}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(d[i][j]);
						}
			System.out.println();
			
		}
		

	}
}


