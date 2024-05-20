/*
 * 김은정
 * 미니과제 4번
 */
import java.util.Random;
import java.util.Scanner;

public class number {

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    String numberString; 
    
    int randomNumber = random.nextInt(999999) + 1;
    int convertMonth;
    int convertDay;
    
    System.out.println("[주민등록번호 계산]");
    System.out.print("출생년도를 입력해 주세요.(yyyy):");
    String birth = scanner.nextLine();
    birth = birth.substring(2);
    System.out.print("출생월을 입력해 주세요.(mm):");
    String month = scanner.nextLine();
    convertMonth = Integer.parseInt(month);
    System.out.print("출생일을 입력해 주세요.(dd):");
    String day = scanner.nextLine();
    convertDay = Integer.parseInt(day);
    System.out.print("성별을 입력해 주세요.(m/f):");
    String gender = scanner.nextLine();
    
    if (gender.equals("m"))
      gender = "3";
    
    else
      gender = "4";
    
    numberString = String.format("%06d", randomNumber);
    month = String.format("%02d", convertMonth);
    day = String.format("%02d", convertDay);
    
    System.out.printf("%s", birth + month + day);
    System.out.print("-");
    System.out.printf("%s", gender + numberString);

  }

}
