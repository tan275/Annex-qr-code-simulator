`1`public abstract class Shape {
	public abstract void area();}
public class Square extends Shape{
	int length,breadth;
	Square(int a,int b){
		length =a;
		breadth = b;}
	
	public void area(){
		System.out.println("area :"+(length*breadth));}

	public static void main() {
		// todo auto-generated method stub
		Shape s = new Square(2,4);
		s.area();
	}
}