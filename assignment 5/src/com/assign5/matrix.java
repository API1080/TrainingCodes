package com.assign5;

public class matrix {
	public static void main(String args[]){  
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{4,4,4},{5,5,5},{6,6,6}};    
		int c[][]={{7,7,7},{8,8,8},{9,9,9}};
		
		int d[][]=new int[3][3];  //3 rows and 3 columns  
		    
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		d[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		d[i][j]+=a[i][k]*b[k][j];      
		}  
		}
		}
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			d[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			d[i][j]+=c[i][k]*b[k][j];      
			}
			System.out.print(d[i][j]+" ");    
			}
			System.out.println();    
			}    
		
		}    

}
