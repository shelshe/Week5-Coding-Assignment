package week5;

public class Application {

	public static void main(String[] args) {

		Logger logger = new AsterickLogger();
		
		
		logger.info("Hello");
		logger.error("Hello");
		logger.space("Hello");
		
	}
	 static void main1(String[] args) {

		Logger logger = new SpacedLogger();
		
		
		logger.info("Hello");
		logger.error("Hello");
		logger.space("Hello");
		
	}
}
