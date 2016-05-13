
public class ElectricBassGuitar extends StringedInstrument{
	public ElectricBassGuitar(){
		super();
		this.fieldName="ElectricBassGuitar";
		this.numberOfStrings=7;		
	}
	public ElectricBassGuitar(int NumberofStrings){
		super();
		this.fieldName="ElectricBassGuitar";
		this.numberOfStrings=NumberofStrings;		
	}
	
	public void play(){
		System.out.println("An ElectricBassGuitar " + numberOfStrings + " - Strings " + fieldName + " is Rocking");
	}
}



