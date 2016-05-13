
public class ElectricGuitar extends StringedInstrument{

public ElectricGuitar(){
super();
this.fieldName="Guitar";
this.numberOfStrings=6;
	}
public ElectricGuitar(int NumberofStrings){
super();
this.fieldName="Guitar";
this.numberOfStrings=NumberofStrings;
}
	public void play(){
		System.out.println("A Guitar " + numberOfStrings + " - Strings " + fieldName + " is Rocking");
	}
}



