package array;

public class MatrixTypeFinder {

	public static void main(String[] args) {

		
		int [][] num = {{1,0,0},{0,1,0},{0,0,1}};
		int row = num.length;
		int col = num[0].length;
		int iCount=0,sCount=0,dCount=0;
	
		if(row == 3 && col ==3 ) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				if(num[0][0] == 1 && num[1][1]==1 && num[2][2]==1) {
					
					if(num[i][j]==0)
						iCount++;
					
				}
				else if(num[0][0] !=1 ) {
					if(num[0][0] == num[1][1] && num[0][0] == num[2][2]) {
						if(num[i][j] == 0)
							sCount++;
					}
					else if(num[0][0] != num[1][1] && num[0][0] != num[2][2]) {
						if(num[i][j] == 0) {
							dCount++;
						}
					}
				}
				
				
				
			}
		}
		if(iCount == 6) {
			System.out.println("Identity Matrix");
			else if (sCount == 6)
			System.out.println("");
		}
		}
		else
			System.out.println("Not A Identity , Scaler,Diagonal Matrix ");
	}

}
