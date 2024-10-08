package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiJson {

	public static void main(String[] args) throws IOException, ParseException {

		// upbit rest api 코인 종목 코드를 제공함. json 데이터 형태로
		// json Javascript Object Notation
		// 데이터를 저장하고 교환하는데 사용되는 경량 데이터 형식! 속성-값 쌍으로 이루어져 있음.

		String allUrl = "https://api.upbit.com/v1/market/all";

		// URL 클래스 특정 프로토콜(HTTP, HTTPS, FTP 등)으로 웹 브라우저가 웹 페이지에 접근하는 것 처럼
		// 인터넷에 있는 자원에 접근할 수 있도록 많은 기능을 제공하는 클래스
		URL url = new URL(allUrl); // 인터넷 요청은 오류가 일어날 수 있기 때문에 예외처리를 해줘야함
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection(); // open: 요청

		// 요청 방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); // 연결 타임 아웃 설정(5초)
		conn.setDoOutput(true);
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴, 200(정상)

		if (resCode == HttpsURLConnection.HTTP_OK) {
			System.out.println(resCode);
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer(); // StringBuffer: 문자열을 하나의 객체에 담아낸다
			// 내용이 없을때 까지 버퍼에 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			in.close();
			System.out.println(response);
			JSONParser parser = new JSONParser();

			JSONArray jasonArray = (JSONArray) parser.parse(response.toString());
			for (Object object : jasonArray) {
				JSONObject obj = (JSONObject) object;
				System.out.println("market: " + obj.get("market"));
				System.out.println("en: " + obj.get("english_name"));
				System.out.println("kr: " + obj.get("korean_name"));
			}

			Scanner sc = new Scanner(System.in);
			
			System.out.println("검색하고 싶은 코인을 입력하세요 >>");
			String user_input = sc.nextLine();
			
			JSONObject resultObj = getCoin(user_input);
			System.out.println(resultObj.get("trade_date"));
			System.out.println(resultObj.get("trade_price"));
			// E는에 오는 숫자는 10의 지수를 나타냄
			// 8.1413 * 10^7 = 81413000
			// 숫자 형식 DecimalFormat
			DecimalFormat format = new DecimalFormat("0,000");
			// System.out.println(format.format(1000000000));
			
			DecimalFormat decFormat = new DecimalFormat("#"); // # 숫자를 출력하되 정수 부분만 출력
			decFormat.setMaximumFractionDigits(0); 			  // 소수점 이하 자릿수를 0으로
			System.out.println("trade_price: " + decFormat.format(resultObj.get("trade_price")));
			
		}

	}

	public static JSONObject getCoin(String code) throws IOException, ParseException {
		JSONObject obj = null;
		// 특정 코인의 시세조회
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=" + code;

		URL url = new URL(detailUrl); // 인터넷 요청은 오류가 일어날 수 있기 때문에 예외처리를 해줘야함
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection(); // open: 요청

		// 요청 방식 설정
		conn.setRequestMethod("GET");

		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴, 200(정상)

		if (resCode == HttpsURLConnection.HTTP_OK) {
			System.out.println(resCode);
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer(); // StringBuffer: 문자열을 하나의 객체에 담아낸다
			// 내용이 없을때 까지 버퍼에 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray) parser.parse(response.toString());
			obj = (JSONObject) arr.get(0);
		}

		return obj;
	}
}