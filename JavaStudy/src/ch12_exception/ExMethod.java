package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class Name 	: ExMethod
 * Author 	  	: Smoothie
 * Created Date : 2024. 8. 20.
 * Version		: 1.0
 * Purpose		:
 * Description  :
 */
public class ExMethod {
	
	public static void printName(String nm) throws BizException {
		// 컴파일, 런타임 오류는 아니지만
		// 우리 업무에서는 오류로 보는 상황에 대한 예외처리 방법
		if(nm.length()==0) {
			throw new BizException("001", "이름에 공백이 입력되었습니다.");
		} else if (nm.length() ==1) {
			throw new BizException("001", "외자는 안됨!");
		}
	}
	
	public static long dateMillsec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		
		return temp.getTime();
	}
	
	public static long dateMillsec2(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		Long result = 0l;
		try {
			temp = (Date) sdf.parse(date);
			result = temp.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}