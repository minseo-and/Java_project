import java.util.Scanner;

import java.util.Scanner;

public class Xiaomi extends Choose{

    public static void Product(){
        Select();
    }
    public static void Select(){
        Scanner scan = new Scanner(System.in);
        String select;
        System.out.println("핸드폰 이어폰 노트북 스마트워치 무엇을 원하시나요? : ");
        select = scan.next();
        if (select.equals("핸드폰")){
            System.out.println("홍미 노트를 드리겠습니다.");
        } else if (select.equals("이어폰")){
            System.out.println("에어 미를 드리겠습니다.");
        } else if (select.equals("노트북")){
            System.out.println("미 노트북 에어를 드리겠습니다.");
        } else if (select.equals("스마트워치")){
            System.out.println("미 워치를 드리겠습니다.");
        }
        else {
            System.out.println("다시 입력 해주세요");
            Select();
        }Another();

    }

    public static void Another() {
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println("다른 필요한건 없으신가요? : 네/아니오");
        answer = scan.next();
        if (answer.equals("네")){
            System.out.println("초기 화면으로 가시겠습니까? : 네/아니오");
            answer = scan.next();
            if (answer.equals("네")){
                Choose.Select();
            } else {
                System.out.println("다시 입력 하시겠습니까? 네/아니오");
                answer = scan.next();
                if (answer.equals("네")) {
                    Select();
                }
                else {
                    System.out.println("감사합니다 안녕히 가세요");

                }
            }

        } else if(answer.equals("아니오")){
            Select();
        } else System.out.println("다시 입력 해주세요");
    }
}
