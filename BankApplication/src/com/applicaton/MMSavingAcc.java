package com.applicaton;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	final private static float MINBA=1000;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float n1) {
		// TODO Auto-generated method stu
	}

	@Override
	public String toString() {
		return super.toString()+"MMSavingAcc []";
	}
	

}
