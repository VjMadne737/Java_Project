class Account
{
	String name;
	String type;
	long accno;
	String branch;
	double bal;
	static String Bankname="icici";
	public Account(String name,String type,long accno,String branch)
	{
		this.name=name;
		this.type=type;
		this.accno=accno;
		this.branch=branch;

	}
	public void showBankname()
	{
		System.out.println(Bankname);
	}
	public void showaccountdetails()
	{
		System.out.println(name);
		System.out.println(accno);
		System.out.println(type);
		System.out.println(branch);
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt)
	{
		bal=bal-amt;
		System.out.println(bal);
	}
	public void checkbal()
	{
		System.out.println(bal);
	}
	public static void main(String[] args) {
		Account a1 =new Account("xyz", "saving",1302992992,"BTR");
		a1.showaccountdetails();
		a1.deposit(1000.0);
		a1.withdraw(600.0);
		System.out.println("_______________");
		Account a2=new Accnnount("abc", "saving",7236991,"BTR");
		a2.showaccountdetails();
		a2.showBankname();
		a2.deposit(900.0);





	}
}