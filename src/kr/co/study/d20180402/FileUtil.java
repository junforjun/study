package kr.co.study.d20180402;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileUtil {
	public static void main(String[] args) {
		try {
			// 1바이트씩 읽을때
			FileInputStream fs = new FileInputStream("C:\\git\\god.txt");
			int data =0;
			while((data =fs.read()) != -1) {
				System.out.print( (char) data);
			}

			fs.close();
			// Line단위로 읽을때
			BufferedReader br = new BufferedReader(new FileReader("C:\\git\\god.txt"));
	        while(true) {
	            String line = br.readLine();
	            if (line==null) break;
	            System.out.println(line);
	        }
	        br.close();

	        FileOutputStream output = new FileOutputStream("c:/git/out.txt");
	        for(int i=1; i<11; i++) {
	            String d = i+" 번째 줄입니다.\r\n";
	            output.write(d.getBytes());
	        }
	        output.flush();
	        output.close();

	        // FileWriter fw = new FileWriter("c:/git/out1.txt");
	        String b = "https://www.google.co.kr/Search?source=hp&ei=7_fSWrjnOoL38QXRn774BA&q=java&oq=java";
	        System.out.println(splitStr(b));

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static String splitStr(String str) {
		String[] spritedStr = str.split("/");
        return spritedStr[spritedStr.length-1];
	}
}
