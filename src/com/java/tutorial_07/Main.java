package com.java.tutorial_07;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== program start ==");

		Scanner sc = new Scanner(System.in); // Scanner sc = new Scanner(System.in); //Scanner 클래스 입출력

		System.out.printf("명령어를 입력 하세요");
//		String command = sc.nextLine(); // sc.nextLine(); 한 라인을 쭉 저장
		String jisus = sc.next(); // 띄어 쓰기 할때 끊어서 가져옴

		System.out.println(jisus); // jisus 출력

		int num = sc.nextInt();

		System.out.println(num);

		sc.close();
		System.out.println("== program finish ==");
	}

}