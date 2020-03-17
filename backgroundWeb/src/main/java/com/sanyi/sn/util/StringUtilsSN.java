package com.sanyi.sn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @功能 用来定义一些字符串处理的通用方法
 * @作者 洋葱
 * @时间 2020年2月19日 上午10:59:03
 * @地点 公司
 * @版本 1.0.0
 * @版权 老九学堂
 *
 */
public final class StringUtilsSN {

	/**
	 * 判断字符串是否为null
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNull(String value) {
		return value == null;
	}

	/**
	 * 判断字符串是否不为null
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNotNull(String value) {
		return !isNull(value);
	}

	/**
	 * 判断字符串是否为null或者空白字符串
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNullOrWhiteSpace(String value) {

		return isNull(value) ? true : value.trim().length() == 0 ? true : false;
	}

	/**
	 * 判断字符串是否不为null或者空白字符串
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNotNullOrWhiteSpace(String value) {
		return !isNullOrWhiteSpace(value);
	}

	public static String formatDate(Date date, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	public static String formatShortDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}

	public static String formatLongDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
}
