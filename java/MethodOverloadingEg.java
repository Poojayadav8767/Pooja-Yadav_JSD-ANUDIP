class Shapes{
	
	//same name same datatype but no of parmeters
	public void area(double base, double height){
		System.out.println("Area of triangle is : " + (0.5 * base * height));
	}
	
	//same name same datatype but no of parmeters
	public void area(double radius){
		System.out.println("Area of circle is : " + (3.14 * radius * radius));
	}
	
	//same name same no of parmeters but datatype change
	public void area(int length, int breadth){
		System.out.println("Area of rectangle is : " + (length * breadth));
	}
	
}
//main class
class MethodOverloadingEg{
	
	public static void main(String args[]){
		Shapes s = new Shapes(); //object creration
		s.area(4.5,6.8); //invoke with object 
		s.area(34.5);
		s.area(55,66);
		
		MethodOverloadingEg.main("mamaa");
	}
	
	
	public static void main(String args){
		System.out.println("hiiiiiiiiiii");
	}
}