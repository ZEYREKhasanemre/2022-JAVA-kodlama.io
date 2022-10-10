package website.coreLogging;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("File e loglandı. "+message);
		
	}

}
