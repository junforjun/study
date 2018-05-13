package kr.co.study.d20180402;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileUtil {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("C:\\git\\a.txt");
			InputStreamReader is = new InputStreamReader(fs);
			int data;
			while((data =is.read()) != -1) {
				System.out.print( (char) data);
			}

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
