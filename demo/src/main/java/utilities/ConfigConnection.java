package utilities;

public class ConfigConnection {
	
	public static void loadPropertyFile() 
	{
		PropertyHandler.loadpropertyfile("config");
		String env = PropertyHandler.getProperty("env");
		if(env.equalsIgnoreCase("qa"))
		{
			PropertyHandler.loadpropertyfile("qaconfig");
			System.out.println("loaded qa config");
		}
		else
		{
			System.out.println("invalid environment");
		}
	}

}
