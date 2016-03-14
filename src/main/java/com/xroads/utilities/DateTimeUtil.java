package com.xroads.utilities;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeUtil {

	public static DateTime longToDateTimeConvertor(DateTime time){
		 //Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		 DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy MM dd HH:mm:ss");
		 String var = fmt.print(time);
		 DateTime var1 = DateTime.parse(var, fmt);
		return var1;
	}
}
