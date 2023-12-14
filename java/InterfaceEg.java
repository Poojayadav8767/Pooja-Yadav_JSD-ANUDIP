interface Car{
		 String carType=null;
	 void turnonCar();	
}

interface Car1{
	 String Fuel=null; 	
}

class HondaCity implements Car, Car1{
	String carType = "manual";
	String Fuel = "petrol";
	public void turnonCar(){
		System.out.println("Turn on car with keys ");
		System.out.println("Manual gear");
		System.out.println(carType + " "+ Fuel);
		
	}	
}

class TataNexon implements Car, Car1{
	String carType = "automatic";
	String Fuel = "electric";
	public void turnonCar(){
		System.out.println("Turn on car with keys ");
		System.out.println("automatic gear");
		System.out.println(carType + " "+ Fuel);
		
	}	
}

class InterfaceEg{
	public static void main(String args[]){
		HondaCity c = new HondaCity();
		c.turnonCar();
		TataNexon t = new TataNexon();
		t.turnonCar();
	}
}