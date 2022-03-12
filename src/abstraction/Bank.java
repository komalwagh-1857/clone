package abstraction;

abstract class Bank {

	abstract int getRateOfIntrest();{
		class SBI extends Bank{

			@Override
			int getRateOfIntrest() {
			
				return 7;
			}
			class PNB extends Bank{

				@Override
				int getRateOfIntrest() {
					
					return 8;
				}
				 class TestBank {
					public void main(String[] args) {
						Bank b;
						b=new SBI();
						System.out.println("Rate of Intrest is:"+b.getRateOfIntrest()+"%");
						b=new PNB();
						System.out.println("Rate of Intrest is:"+b.getRateOfIntrest()+"%");
					}
					}

			}
		}

	}
	
}

