package com.framework;


	public abstract class ShopAcc {

		private int accNo;
		private String accNm;
		private float charges;
		public ShopAcc(int accNo, String accNm, float charges) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.charges = charges;
		}
		abstract public  void bookProduct(float n1);
		abstract public void items(float n1);
		@Override
		public String toString() {
			return super.toString()+ "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
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
		 * @return the charges
		 */
		public float getCharges() {
			return charges;
		}
		/**
		 * @param charges the charges to set
		 */
		public void setCharges(float charges) {
			this.charges = charges;
		}
	
			
		
		

		
	 


}
