package com.framework;


public abstract class PrimeAcc extends ShopAcc {
		private boolean isPrime;
 private static float deliveryCharges = 0;
 public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	super(accNo, accNm, charges);
	this.isPrime = isPrime;
}
@Override
public String toString() {
	return super.toString()+"PrimeAcc [isPrime=" + isPrime + "]";
}
/**
 * @return the isPrime
 */
public boolean isPrime() {
	return isPrime;
}
/**
 * @param isPrime the isPrime to set
 */
public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}
/**
 * @return the deliverycharges
 */
public static float getDeliverycharges() {
	return deliveryCharges;
}
/**
 * @param deliverycharges the deliverycharges to set
 */
public static void setDeliverycharges(float deliverycharges) {
	deliveryCharges = deliverycharges;
}
	
 
		
		@Override
abstract public  void bookProduct(float n1);
		
		

	

}
