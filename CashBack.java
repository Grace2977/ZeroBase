/*
 * 김은정
 * 미니과제 2번
 */
import java.util.Scanner;

public class CashBack {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double convertedCash;
    int cashBack;
    int maxCashBack = 300;
    
    System.out.println("[캐시백 계산]");
    System.out.print("결제 금액을 입력해 주세요.(금액):");
    
    String Cash = scanner.nextLine();
    
    convertedCash = Double.parseDouble(Cash); //parseInt = 문자를 숫자로 바꿔주는 문법
    
    cashBack = (int)(convertedCash * 0.1);
    
    if (cashBack >= maxCashBack)
      cashBack = maxCashBack;
    
    else if (cashBack - 200 >= 0)
      cashBack = 200;
    
    else if (cashBack - 100 >= 0)
      cashBack = 100;
    
    else
      cashBack = 0;
    
    System.out.println("결제 금액은 " + Cash + "원이고, " + "결제 금액은 " + cashBack + "원 입니다.");

  }

}
