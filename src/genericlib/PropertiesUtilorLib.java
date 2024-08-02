package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilorLib
{

	public String getDatafromproperties(String data) throws Exception
	{
		FileInputStream fis =  new FileInputStream(IconstantUtility.propertiespath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String info = pobj.getProperty(data);
		return info;
	}
}
