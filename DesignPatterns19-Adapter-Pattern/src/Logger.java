
public class Logger {
	
	
	public LogWriter logWriter;

	public void write(String text){
		
		System.out.println("writing logger ..." + text);
		logWriter.out(text);
	}
}
