package com.client;

import com.application.GSNormalAcc;
import com.application.GSPrimeAcc;
import com.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAcc(123, "vj", 2000, false);
		
		gssfactory.getNewNormalAcc(111, "viju", 2000, 2);
		
		GSPrimeAcc gsprime = new GSPrimeAcc(123, "vj", 2000, false);
		System.out.println(gsprime);
		gsprime.getAccNm();
		gsprime.getCharges();                                                                     
		gsprime.getCharges();
		
		gsprime.bookProduct(2000);
		gsprime.toString();
		
		GSNormalAcc gsnormal = new GSNormalAcc(111, "viju",2000, 1);
		System.out.println(gsnormal);
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		gsnormal.bookProduct(2000);
		gsnormal.toString();
		

	}

}
