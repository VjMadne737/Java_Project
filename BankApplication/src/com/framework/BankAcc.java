package com.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	/**
	 * @return the accNm
	 */
	public String getAccNm() {
		return accNm;
	}

	/**
	 * @param accNm the accNm to set
	 */
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	/**
	 * @return the accBal
	 */
	public float getAccBal() {
		return accBal;
	}

	/**
	 * @param accBal the accBal to set
	 */
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	abstract public void withdraw(float n1);
	abstract public void deposit(float n1);

	@Override
	public String toString() {
		return super.toString()+"BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	

	
	
	
	

}
