package com.hcflcm;

public class hcflcm {
		public int checkhcf(int a,int b,int c) {
			int prod=a*b*c;
			int hcf=1;
			for(int i=2;i<=prod;i++) {
				if(a%i==0&&b%i==0&&c%i==0)
					hcf=i;
					break;
			}
			
			return hcf;
			
		}
		
		public int checklcm(int a , int b , int c) {
			int lcm=0;
			int prod=a*b*c;
			for(int i=1;i<=prod;i++) {
				if(i%a==0&&i%b==0&&i%c==0)
					lcm=i;
					break;
			}
			
			return lcm;
		}
}
