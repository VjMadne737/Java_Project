package com.application;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float n1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void items(float n1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString()+ "GSNormalAcc []";
	}


	

}
