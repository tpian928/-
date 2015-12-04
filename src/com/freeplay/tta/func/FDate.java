package com.freeplay.tta.func;

import java.util.Calendar;

public class FDate {

	/**
	 * 得到买票日期
	 * @return
	 */
	public static String getBDate(String tDate) {
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(tDate.substring(0, 4)), Integer.parseInt(tDate.substring(4, 6)), Integer.parseInt(tDate.substring(6, 8)));
		System.out.println(cal.YEAR+"年"+cal.MONTH+"月"+cal.DAY_OF_MONTH+"日");
		cal.set(Calendar.DATE, -60);
		System.out.println(cal.YEAR+"年"+cal.MONTH+"月"+cal.DAY_OF_MONTH+"日");
		return cal.YEAR+""+cal.MONTH+""+cal.DAY_OF_MONTH+"";
	}
	
}
