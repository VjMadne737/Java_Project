package com.client;


import com.applicaton.MMBankFactory;
import com.applicaton.MMCurrentAcc;
import com.applicaton.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingeAcc(123, "vj", 2000, false);
		mmbfactory.getNewCurrentAcc(111, "viju", 2000, 2);
		
		MMSavingAcc msaving = new MMSavingAcc(123, "seemaj", 2000, false);
		System.out.println(msaving);
		msaving.getAccNm();
		msaving.getAccBal();                                                                     
		msaving.getMINBAL();
		
		
		msaving.deposit(1000);
		msaving.toString();
		
		MMCurrentAcc mcurrent = new MMCurrentAcc(111, "viju",2800, 1);
		System.out.println(mcurrent);
		mcurrent.getAccNm();
		mcurrent.getAccNo();
		mcurrent.getAccBal();
		mcurrent.getCreditLimit();
		
		mcurrent.withdraw(250);
		mcurrent.toString();
		
	}

}
