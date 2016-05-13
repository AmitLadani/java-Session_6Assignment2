
public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricBassGuitar obj1=new ElectricBassGuitar();
		ElectricGuitar obj2=new ElectricGuitar();
		
		obj1.play();
		obj2.play();
		obj1=new ElectricBassGuitar(8);
		obj2=new ElectricGuitar(2);
		obj1.play();
		obj2.play();
	}

}
