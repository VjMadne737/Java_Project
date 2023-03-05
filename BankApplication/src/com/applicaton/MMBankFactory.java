package com.applicaton;


import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingeAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, false);
		
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);

		return null;
	}

}
