package oopKodlamaIO.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Logged to Database :" +data);
	}

}
