
public class ConsoleLogWritter2 extends ConsoleWriter implements LogWriter {

	//Inheritance
	
	@Override
	public void out(String text) {
		this.writeConsole(text);
		
	}

}
