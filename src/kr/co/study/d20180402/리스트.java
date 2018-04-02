package kr.co.study.d20180402;

import java.util.ArrayList;
import java.util.List;

public class 리스트 {
	public static void main(String[] args) {

		// 리스트의 선언 및 인스턴스 생성
		// <>사이는 제네릭(형의 고정, 명시적 선언)
		List<String> list = new ArrayList<String>();
		list.add("1");
		String temp = list.get(0);
		System.out.println(temp);

		// 제네릭을 생략해도 되나, 경고밑줄이 그어지게 되고 변수를 꺼낼때 ()으로 캐스팅을 해줘야 함
		List noGeneric = new ArrayList();
		noGeneric.add("1");
//		temp = noGeneric.add("1"); // 이 구문은 에러(캐스팅 없음)
		temp = (String)noGeneric.get(0);
		System.out.println(temp);
		
		// 반복문으로 값 출력(foreach)
		for (String s : list) {
			System.out.println(s);
		}
		
		// 주소값으로 get해서 반복문으로 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// contains 값이 들어있는지 확인
		System.out.println(list.contains("1"));
		
		// isEmpty 배열의 사이즈가 0인지 확인(true반환)
		System.out.println(list.isEmpty());
		
		// remove 지정된 배열의 값을 삭제
		list.remove(0);
		
		// size 배열의 크기를 얻음
		System.out.println(list.size());

	}
}
