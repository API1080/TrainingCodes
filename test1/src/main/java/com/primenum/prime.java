package com.primenum;

public class prime {
	public boolean checkPrime(int n){  
		  int i,m=0;      
		  m=n/2;      
		  if(n<=1){  
		   return false;      
		  }else{  
		   for(i=2;i<m;i++){      
		    if(n%i==0){      
		     return false;                
		    }      
		   }      
		  return true;   
		  }
		  }  
}