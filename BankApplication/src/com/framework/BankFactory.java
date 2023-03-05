package com.framework;

public interface BankFactory {
	public abstract SavingAcc getNewSavingeAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);

}
