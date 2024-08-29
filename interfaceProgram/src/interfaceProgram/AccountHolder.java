package interfaceProgram;

public class AccountHolder implements HDFC {
	@Override
    public void deposite() {
		 System.out.println("I  deposited 5000 ");
	 }
     @Override
	 public void withdraw() {
		 System.out.println("I  withdraw 5000 ");
	 }

	public static void main(String[] args) {
		AccountHolder acc=new AccountHolder();
		acc.deposite();
		acc.withdraw();

	}

}
