package org.example;

import org.apache.http.util.TextUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy"); // 声明变量

	private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");	// 声明变量

	private final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");	//声明变量

	private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 声明变量
	private final static SimpleDateFormat sdfTimes = new SimpleDateFormat("yyyyMMddHHmmss");	// 声明变量

	//获取当天时间
	public static String getNowTime(String dateformat) {
		Date now = new Date();	// 新时间对象
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);//可以方便地修改日期格式
		String time = dateFormat.format(now);
		return time;	// 返回目标格式的当前时间
	}

	/**
	 * 获取YYYY格式
	 * @return
	 */
	public static String getYear() {
		return sdfYear.format(new Date());	// 返回数据
	}

	/**
	 * 获取YYYY-MM-DD格式
	 * @return
	 */
	public static String getDay() {
		return sdfDay.format(new Date());	// 返回数据
	}

	/**
	 * 获取YYYYMMDD格式
	 * @return
	 */
	public static String getDays() {
		return sdfDays.format(new Date());	// 返回数据
	}

	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * @return
	 */
	public static String getTime() {
		return sdfTime.format(new Date());	// 返回数据
	}

	/**
	 * 获取YYYYMMDDHHmmss格式
	 * @return
	 */
	public static String getTimes() {
		return sdfTimes.format(new Date());	// 返回数据
	}

	/**
	 * @Title: compareDate
	 * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
	 * @param s
	 * @param e
	 * @return boolean
	 * @throws
	 * @author luguosui
	 */
	public static boolean compareDate(String s, String e) {
		if (fomatDate(s) == null || fomatDate(e) == null) { //判断
			return false;
		}
		return fomatDate(s).getTime() >= fomatDate(e).getTime(); // true or false
	}

	/**
	 * @Title: compareDateTime  yyyy-MM-dd HH：MM：ss
	 * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
	 * @param s
	 * @param e
	 * @return boolean
	 * @throws
	 * @author luguosui
	 */
	public static boolean compareDateTime(String s, String e) {
		if (fomatDateTime(s) == null || fomatDateTime(e) == null) { // 判断
			return false;
		}
		return fomatDateTime(s).getTime() >= fomatDateTime(e).getTime();  // true or false
	}

	/**
	 * 格式化日期
	 * @return
	 */
	public static Date fomatDate(String date) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); // 声明变量
		try {	// 逻辑操作
			return fmt.parse(date);	// 返回数据
		} catch (ParseException e) {
			e.printStackTrace();	// 保存打印错误信息，返回 null
			return null;
		}
	}

	/**
	 * 获得2017-01-06 减去2h的时间
	 * @param date
	 * @return
	 */
	public static String get22hTime(String date){
		Date initDate = fomatDate(date);	// 转换为时间对象
		long initTime = initDate.getTime();
		long time = 2*60*60*1000;
		return sdfTime.format(new Date(initTime-time));	// 返回数据
	}
	/**
	 * 格式化日期 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static Date fomatDateTime(String date) {
		try {	// 逻辑操作
			return sdfTime.parse(date);	// 返回数据
		} catch (ParseException e) {
			e.printStackTrace();	// 报错打印，返回数据
			return null;
		}
	}

	/**
	 * 校验日期是否合法
	 * @return
	 */
	public static boolean isValidDate(String s) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); // 声明变量
		try {	// 逻辑操作
			fmt.parse(s);
			return true;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return false;
		}
	}

	public static int getDiffYear(String startTime, String endTime) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");	// 声明变量
		try {	// 逻辑操作
			long aa = 0;
			int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / (1000 * 60 * 60 * 24)) / 365);
			return years;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return 0;
		}
	}

	/**
	 * <li>功能描述：时间相减得到天数
	 * @param beginDateStr
	 * @param endDateStr
	 * @return long
	 * @author Administrator
	 */
	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = null;
		Date endDate = null;

		try {	// 逻辑操作
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
		} catch (ParseException e) {
			e.printStackTrace();	// 输出错误信息
		}
		day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
		// System.out.println("相隔的天数="+day);

		return day;// 返回结果数据
	}

	/**
	 * 得到n天之后的日期
	 * @param days
	 * @return
	 */
	public static String getAfterDayDate(String days,String fmt) {
		int daysInt = Integer.parseInt(days);  // 声明变量

		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();	// 获取时间

		SimpleDateFormat sdfd = new SimpleDateFormat(fmt);
		String dateStr = sdfd.format(date);

		return dateStr;		// 返回数据
	}

	/**
	 * 得到n天之后是周几
	 * @param days
	 * @return
	 */
	public static String getAfterDayWeek(String days) {
		int daysInt = Integer.parseInt(days);	// 声明变量

		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();	// 获取时间

		SimpleDateFormat sdf = new SimpleDateFormat("E");
		String dateStr = sdf.format(date);	// 逻辑处理

		return dateStr;	// 返回数据
	}


	//	计算某个日期之后的天数或月数的时间
	public static Date calEndDayDate(Date startDate, int months, int calendar){
		Calendar sCalendar = Calendar.getInstance();//将开始时间赋给日历实例
		sCalendar.setTime(startDate);
		sCalendar.add(calendar,months);//计算结束时间
		return sCalendar.getTime();		//返回Date类型结束时间
	}

	/*
	 * 将时间转换为时间戳
	 */
	public static String dateToStamp(String s) throws ParseException{
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simpleDateFormat.parse(s);
		long ts = date.getTime();
		res = String.valueOf(ts);
		return res; // 返回数据
	}


	/**
	 * 日期格式字符串转换成时间戳 （10位时间戳）
	 *
	 * @param dateStr 字符串日期
	 * @param format   如：yyyy-MM-dd HH:mm:ss
	 *
	 * @return
	 */
	public static String Date2TimeStamp(String dateStr, String format) {
		try {
			if (TextUtils.isEmpty(format))
				format = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return String.valueOf(sdf.parse(dateStr).getTime() / 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}


	/**
	 * 计算2个日期相差多少年
	 * 列：2011-02-02  ~  2017-03-02 大约相差 6.1 年
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public static BigDecimal yearCompare(String fromDate, String toDate) throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=format.parse(fromDate);
		Date date2=format.parse(toDate);

		int day=0;

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		if(date1.getTime()>date2.getTime()) {
			cal1.setTime(date2);
			cal2.setTime(date1);
		} else {
			cal1.setTime(date1);
			cal2.setTime(date2);
		}

		int day1= cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if(year1 != year2) {//不同年
			int timeDistance = 0 ;
			for(int i = year1 ; i < year2 ; i ++) {
				if(i%4==0 && i%100!=0 || i%400==0) {//闰年
					timeDistance += 366;
				} else {//不是闰年
					timeDistance += 365;
				}
			}
			day=timeDistance + (day2-day1) ;
		} else {//同一年
			day=day2-day1;
		}
		BigDecimal res=new BigDecimal(String.valueOf(day)).divide(new BigDecimal("365"), 2, RoundingMode.HALF_UP);
		return res;
	}






		public static void main(String[] args) {
			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH);
			int day = now.get(Calendar.DATE);

			int hour = now.get(Calendar.HOUR);
			System.out.println(year+"-"+month+"-"+day+" "+hour+":"+"00"+":00");
		}

}
