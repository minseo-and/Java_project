import java.util.Scanner;

public class Choose {

    static String cellPhone, earPhone, lapTop, watch;

    public static void Select(){

        Scanner scan = new Scanner(System.in);

        String a;

        System.out.println("원하시는 회사를 선택해 주세요 : 삼성, 애플, 엘지, 샤오미, 없어요");
        a = scan.next();
        Company(a);

    }
    public static void Company(String a){
        Scanner scan = new Scanner(System.in);
        String answer;

        if (a.equals("삼성")){
            Samsung.Product();
        } else if (a.equals("애플")){
            Apple.Product();
        } else if (a.equals("엘지")){
            LG.Product();
        } else if (a.equals("샤오미")){
            Xiaomi.Product();
        } else {
            System.out.println("다시 입력 하시겠습니까? 네/아니오");
            answer = scan.next();
            if (answer.equals("네")){
                Select();
            }
            else {
                System.out.println("안녕히 가세요");
            }
        }
    }
}
