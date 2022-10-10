package website.coreLogging;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Email e loglandı. "+message);
		
	}

}
