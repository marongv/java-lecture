import java.io.*;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class NaverPriceApp {
	
	public static void main(String[] args) throws Exception {
		
		// java NaverPriceApp 맥북프로 2000000 3000000
		
		//-- 사용자가 규칙을 어기고 맥북프로 2000000 3백만원
		//-- 이런 값을 넣었을때, maxPrice에는 3백만원은 Integer로 변환이 불가
		//-- 따라서 Exception을 발생시킨다.
		
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]);
//		int maxPrice = Integer.parseInt(args[2]);
		
		// 1. 개발자가 처리하는 방식
		// try {} catch() {} finally {}
		
		String goodsName = "";
		int minPrice = 0, maxPrice = 0;
		
		try {
			goodsName = args[0];
			minPrice = Integer.parseInt(args[1]);	
			maxPrice = Integer.parseInt(args[2]);
		} catch(NumberFormatException ne) {
			
			//-- try 구문중에 NumberFormatException이 발생할 경우 실행
			System.out.println("사용법 > java NaverPriceApp 상품명 최소가격 최대가격");
			System.out.println("ex > java NaverPriceApp 아이패드 10000 20000");
			//return;
			
		} catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("3개를 넣어라");
			//return;
			
		} catch(Exception ex) {
			
			System.out.println("무슨값을 넣은거?");
			//return;
			
		} finally {
			System.out.println("끗!");
		}
		
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL, maxPrice, minPrice, goodsName);
		System.out.println(URL);
		
		//-- 1. java.net 패키지로 사용하기
		//String html = getHtml(URL);
		//System.out.println(html);
		
		//getHtmlByJsoup(URL);
		
		
//		'박경란'의 '집'은 '부천'입니다.
//		String name = "박경란";
//		String home = "집";
//		String dong = "부천";
//		
//		System.out.println(name + "의 " + home + "은 " + dong + "입니다.");
//		
//		String format = "%s의 %s은 %s입니다. %d"; // %s 문자열  %d 숫자
//		format = String.format(format, name, home, dong, 10000);
//		System.out.println(format);
//		
		
	}
	
	//-- Jsoup 로 HTML Parse
	private static void getHtmlByJsoup(String pUrl) throws Exception{
		
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		Elements files = html.select(".list_basis");
		System.out.println(files.size());
		
		for(int i=0; i<files.size(); i++) {
			System.out.println(files.get(i).text());
		}
		
		
	}
	
	
	//-- URL을 가지고, 접속, HTML을 가지고 온다.
	private static String getHtml(String pUrl) throws Exception{
		
		String result = ""; 
		HttpURLConnection conn;  //-- 웹 연결 클래스 
		BufferedReader rd;			//-- 라인단위 Input 클래스
		String line;						//-- 라인단위로 읽을 String을 임시저장
		
		URL url = new URL(pUrl);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		while((line = rd.readLine()) != null) {
			result += line + "\n"; // result = result + line + "\n"
		}
		
		rd.close();		
		return result;
	}

}
