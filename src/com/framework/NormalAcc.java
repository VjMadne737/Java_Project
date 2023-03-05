package com.framework;


public abstract class NormalAcc extends ShopAcc{
   private float deliveryCharges;

public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	super(accNo, accNm, charges);
	this.deliveryCharges = deliveryCharges;
}

/**
 * @return the deliveryCharges
 */
public float getDeliveryCharges() {
	return deliveryCharges;
}

/**
 * @param deliveryCharges the deliveryCharges to set
 */
public void setDeliveryCharges(float deliveryCharges) {
	this.deliveryCharges = deliveryCharges;
}

@Override
public String toString() {
	return super.toString()+"NormalAcc [deliveryCharges=" + deliveryCharges + "]";
}
@Override
abstract public  void bookProduct(float n1);

}
