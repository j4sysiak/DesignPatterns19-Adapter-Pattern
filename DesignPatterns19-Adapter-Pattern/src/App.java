public class App {
	 
	public static void main(String[] args) {
		
		//uses Composition
		Logger logger = new Logger(new ConsoleLogWritter());
		logger.write("application started 2019-02-24 06:31");
		
		//uses Inheritance
		Logger logger2 = new Logger(new ConsoleLogWritter2());
		logger2.write("application started 2019-02-24 06:50");
	}
}

 