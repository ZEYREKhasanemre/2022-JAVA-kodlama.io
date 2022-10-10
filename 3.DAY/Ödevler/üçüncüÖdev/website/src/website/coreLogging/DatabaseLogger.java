package website.coreLogging;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Database e loglandı. "+message);
		
	}
	
}
