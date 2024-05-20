/*
 * 김은정
 * 미니과제 3번
 */
import java.util.Scanner;

public class Ticket {

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    
    int entranceFee;
    int convertAge;
    int convertTime;
    
    System.out.println("[입장권 계산]");
    System.out.print("나이를 입력해 주세요.(숫자):");
    String age = scanner.nextLine();
    convertAge = Integer.parseInt(age);
    System.out.print("입장시간을 입력해 주세요.(숫자입력):");
    String time = scanner.nextLine();
    convertTime = Integer.parseInt(time);
    System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
    String merit = scanner.nextLine();
    System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
    String card = scanner.nextLine();
    
    if (convertAge < 3)
      entranceFee = 0;
    
    else if (convertAge < 13 || convertTime >= 17)
      entranceFee = 4000;
    
    else if (merit.equals("y") || card.equals("y"))
      entranceFee = 8000;
    
    else
      entranceFee = 10000;
    
    System.out.println("입장료: " + entranceFee);

  }

}
