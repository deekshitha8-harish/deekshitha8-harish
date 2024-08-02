package genericlib;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaLibrary 
{
	/**
	 * this method is to create random number
	 */
	public int generateRandomNumber(int bound)
	{
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
	}
	/**
	 * this is a generic method to handle calendar
	 * @param formateType
	 * @return
	 */
	public String calenderHandling(String formateType)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(formateType);
		String date = sdf.format(d);
		return date;
	}
}
