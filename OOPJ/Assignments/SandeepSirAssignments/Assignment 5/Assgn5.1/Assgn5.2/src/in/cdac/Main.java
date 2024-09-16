package in.cdac;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Application Started  ");
		
		System.out.println("Current logs : \n" +logger.getLog());
		
		logger.clearLog();
		System.out.println("Logs cleared.\nCurrent Logs:\n"+logger.getLog());
	}
}