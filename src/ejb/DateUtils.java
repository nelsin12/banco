package ejb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateUtils {

	public static Integer getDiferenciaFechasEnMeses(Date fecha){
		Integer num_meses = 0;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String fecha_actual = dateFormat.format(date);
		
		Date d1 = null;
		Date d2 = null;
		try {
		    d1 = fecha;
		    d2 = dateFormat.parse(fecha_actual);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		long diff = d2.getTime() - d1.getTime();
		long diffMonths = diff / (30 * 24 * 60 * 60 * 1000);
		
		num_meses = Math.toIntExact(diffMonths);
		return num_meses;
	}
}
