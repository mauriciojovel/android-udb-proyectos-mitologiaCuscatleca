package com.udb.shinmen.mad.mitologia.cuscatleca.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

import android.content.Context;
import android.text.format.DateFormat;

public class Formatter {
	public static String money(Number n) {
		if(n == null) {
			return "";
		} {
			return NumberFormat.getCurrencyInstance().format(n.doubleValue());
		}
	}
	
	public static String numberDecimal(Number n) {
		if(n == null) {
			return "";
		} else {
			return NumberFormat.getCurrencyInstance().format(n.doubleValue());
		}
	}
	
	public static String dateShort(Date d, Context context) {
		if(d == null) {
			return "";
		} else {
			return DateFormat.getDateFormat(context).format(d);
		}
	}
	
	public static Date parserDateShort(String d, Context context) 
			throws ParseException {
		if(d == null || d.trim().equals("")) {
			return null;
		} else {
			return DateFormat.getDateFormat(context).parse(d);
		}
	}
	
	public static Date numberToDate(Number n) {
		return (n!=null&&n.longValue()>0)?new Date(n.longValue()):null;
	}
}
