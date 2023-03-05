package com.applicaton;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimt) {
		super(accNo, accNm, accBal, creditLimt);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(float n1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return super.toString()+"MMCurrentAcc []";
	}
	
	

}
