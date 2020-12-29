package com.yueqian.epidemic_domain.comm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 格式化字符串到日期
	 */
	public static Date parseStr2Date(String str) {
		try {
			return sdf1.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 格式化日期到字符串
	 */
	public static String formatDate2Str(Date date) {
		return sdf1.format(date);
	}
	/**
	 * 格式化字符串到时间
	 */
	/**
	 * 格式化字符串到年月日时分秒
	 */
}
