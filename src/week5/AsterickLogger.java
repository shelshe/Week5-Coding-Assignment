package week5;

public class AsterickLogger implements Logger{

	@Override
	public void info(String info) {
		System.out.println("***"  + info + "***"); 

		
	}

	@Override
	public void error(String error) {
		String error2 = (error).replace("", " ").trim();
		System.out.println("********" );
		System.out.println("***Error:" + error2 +"***" );
		System.out.println("*********" );		
	}

	@Override
	public void space(String space) {
		String space2 = (space).replace("", " ").trim();
		System.out.println(space2);
	}

	

}
