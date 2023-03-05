package com.application;

import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.ShopFactory;

@SuppressWarnings("unused")
public class GSShopFactory implements ShopFactory {
	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, false);
		
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges, charges);

		return gsnormal;
	}


}
