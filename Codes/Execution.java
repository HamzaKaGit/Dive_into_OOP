public class Execution {
	public static void main(String[] args) {
	ElectricGuitar guitar = new ElectricGuitar();
	ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
		
		guitar.play();
		bassGuitar.play();
		
		guitar = new ElectricGuitar(7);
		bassGuitar = new ElectricBassGuitar(5);
		
		guitar.play();
		bassGuitar.play();
	}
}
