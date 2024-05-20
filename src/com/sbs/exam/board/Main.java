package com.sbs.exam.board;

import java.text.BreakIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("==텍스트 게시판 자바==");
        System.out.println("★프로그램 시작★");


        while (true) {
            System.out.printf("명령 :");
            String cmss = sc.nextLine();
            System.out.printf("입력된 명령어 : %s\n", cmss);

            if(cmss.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
            break;
            }

        }





      sc.close();

        }
    }
