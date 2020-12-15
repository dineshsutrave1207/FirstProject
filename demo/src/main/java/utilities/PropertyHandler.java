package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyHandler {
	 private static Properties configProp;
	 
	 public static Properties loadpropertyfile(String file)
	 {
		 configProp =new Properties();
		 try {
			 configProp.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\utils\\"+file+".properties")));
		 }
		 catch(Exception e)
		 {
			 System.out.print(e.getMessage());
		 }
		return configProp;	 
	 }
	 
	 public static String getProperty(String key) {
		 return configProp.getProperty(key);
	 }
	 

}
