//parent class
class RBI{	
	 void calcFD(double interest){
		double amt = 5000;
		int duration = 12;
		System.out.println((amt * duration * interest) / 100);
	}	
}
//child class
class BOI extends RBI{
	void calcFD(double interest){
		double amt = 5000;
		int duration = 12;
		System.out.println((amt * duration * interest) / 100);
	}
}
//child class
class SBI extends RBI{
	void calcFD(double interest){
		double amt = 5000;
		int duration = 12;
		System.out.println((amt * duration * interest) / 100);
	}
}
//child class
class Axis extends RBI{
	void calcFD(double interest){
		double amt = 5000;
		int duration = 12;
		System.out.println((amt * duration * interest) / 100);
	}
}
//child class
class ICICI extends RBI{	
	void calcFD(double interest){
		double amt = 5000;
		int duration = 12;
		System.out.println((amt * duration * interest) / 100);
	}
}
class MethodOverridingEg{
	public static void main(String args[]){
		BOI b = new BOI();
		b.calcFD(5.5);
		
		SBI s = new SBI();
		s.calcFD(6.2);
		
		Axis a = new Axis();
		a.calcFD(6.0);
		
		ICICI i = new ICICI();
		i.calcFD(7.5);
	}

}