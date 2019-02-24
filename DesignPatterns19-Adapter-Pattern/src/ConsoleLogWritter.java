
public class ConsoleLogWritter implements LogWriter {

	//composition
	private ConsoleWriter consoleWriter = new ConsoleWriter();
	
	@Override
	public void out(String text) {

		consoleWriter.writeConsole(text);
	}

}
