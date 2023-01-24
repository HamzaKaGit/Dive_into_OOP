public class ElectricGuitar extends StringedInstrument {

	public ElectricGuitar() {
		super();
		this.name = "Guitar";
		this.numberOfStrings = 6;
	}
	
	public ElectricGuitar(int numberOfStrings) {
		super();
		this.name = "Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	public void play() {
		System.out.println("An electric " + numberOfStrings + "-string " + name+ " is rocking!");
	}
}
