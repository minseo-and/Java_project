package test_2404;

import java.util.Scanner;

public class Choose {

    public void Select() {
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.println("원하시는 회사를 선택해 주세요 : 삼성, 애플, 엘지, 샤오미, 없어요");
        a = scan.next();
        Select(a);
    }

    public void Select(String a) {
        // Select라는 메서드 이름은 같지만 매개변수의 개수와 타입이 다르기 때문에 메서드 오버로딩
        Samsung samsung = new Samsung();
        Apple apple = new Apple();
        LG lg = new LG();
        Xiaomi xiaomi = new Xiaomi();
        Scanner scan = new Scanner(System.in);
        String answer;
        if (a.equals("삼성")) {
            samsung.Product();
        } else if (a.equals("애플")) {
            apple.Product();
        } else if (a.equals("엘지")) {
            apple.Product();
        } else if (a.equals("샤오미")) {
            xiaomi.Product();
        } else {
            System.out.println("다시 입력 하시겠습니까? 네/아니오");
            answer = scan.next();
            if (answer.equals("네")) {
                Select();
            } else {
                System.out.println("안녕히 가세요");
            }
        }
    }
}
