package com.framework;

public class SavingAcc extends BankAcc {
	private boolean isSalaried;
	 private static float MINBAL =1000;
	 public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.isSalaried=isSalaried;
		
	}
	 
	/**
	 * @return the isSalaried
	 */
	public boolean isSalaried() {
		return isSalaried;
	}

	/**
	 * @param isSalaried the isSalaried to set
	 */
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	/**
	 * @return the mINBAL
	 */
	public static float getMINBAL() {
		return MINBAL;
	}

	/**
	 * @param mINBAL the mINBAL to set
	 */
	public static void setMINBAL(float mINBAL) {
		MINBAL = mINBAL;
	}

	@Override
	public void withdraw(float n1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(float n1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString()+"SavingAcc [isSalaried=" + isSalaried + "]";
	}
	 
	
	
	


}
