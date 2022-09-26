package onlinevideos;

public class jaggedarray {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5};
	int b[]= {4,5,6};
		
	int d[][]= {
				{1,2,3,4,5},
				{4,5,6},
				{6,5,4,9,8,7},
				{4,4,4,4},
				{5,5,5,5,}
		};
		for(int i=0;i<d.length;i++)
				{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
							}
			System.out.println();	
					}
	
		
		}


	}


