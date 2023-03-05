package com.framework;

public class CurrentAcc extends BankAcc {
	private float creditLimit=2;

public CurrentAcc(int accNo, String accNm, float accBal, float creditLimt) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.creditLimit=creditLimit;
		
	}

/**
 * @return the creditLimit
 */
public float getCreditLimit() {
	return creditLimit;
}

/**
 * @param creditLimit the creditLimit to set
 */
public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
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
	return super.toString()+"CurrentAcc [creditLimit=" + creditLimit + "]";
}


}
