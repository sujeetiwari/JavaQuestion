import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class dateAndTime {

	public static void main(String[] args) {
		//date and time
//		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//System.out.println(Long.MAX_VALUE);
//System.out.println(System.currentTimeMillis());
		//date class
//		Date d= new Date();
//		System.out.println(d);
//		System.out.println(d.getTime());
//		System.out.println(d.getDate());
//		System.out.println(d.getHours());
//		System.out.println(d.getYear());
//		System.out.println(d.getDay());
//		
//		//Local date and time
//		LocalDate d1=LocalDate.now();
//		System.out.println(d1);
//		LocalTime t=LocalTime.now();
//		System.out.println(t);
//		LocalDateTime dt1=LocalDateTime.now();
//		System.out.println(dt1);
//		
//		//Date time formatter
//		LocalDateTime dt=LocalDateTime.now();//this is a date
//		System.out.println(dt);
//		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy---E ---- H:m a  ");//this is the format
//		DateTimeFormatter df1=DateTimeFormatter.ISO_LOCAL_DATE;
//		String myDate=dt.format(df);//creating date string using date and format
//		System.out.println(myDate);
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		System.out.println(Long.MAX_VALUE);
		Date d=new Date();
		System.out.println(d.getDay());
		System.out.println(d.getTime());
	}

}