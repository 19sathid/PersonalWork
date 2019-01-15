package inheritance;

public class Square extends Rectangle{

	public Square(){
		super(6, 6, 6);
	}
	
	public Square(double side){
		super(side, side, side);
	}
}
