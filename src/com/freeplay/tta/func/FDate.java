package com.freeplay.tta.func;

import java.util.Calendar;
import java.util.Date;


public class FDate {

	/**
	 * 得到买票日期
	 * @return
	 */
	public static String getBDate(int year,int month,int day,int minus_day) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.add(Calendar.DATE, -minus_day);
		int real_mon = cal.get(Calendar.MONTH) +1;
		return cal.get(Calendar.YEAR)+"年"+real_mon+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日";
	}
	
	public static void main(String[] args)
	{
		System.out.println(getBDate(2016, 2, 23, 60));
	}
	
}
