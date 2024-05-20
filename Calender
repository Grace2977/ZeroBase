/*
 * 김은정
 * 미니과제 5번
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class monthly {
  public static void main(String[] args) 
  {
      Scanner scanner = new Scanner(System.in);
      
      int integerYear;
      int integerMonth;
      
      System.out.println(" [달력 출력 프로그램]");
      System.out.print(" 달력의 년도를 입력해 주세요.(yyyy):");
      String year = scanner.nextLine();
      integerYear = Integer.parseInt(year);
      System.out.print(" 달력의 월을 입력해 주세요.(mm):");
      String month = scanner.nextLine();
      integerMonth = Integer.parseInt(month);
      month = String.format("%02d", integerMonth);
      
      int firstYear = (integerMonth == 1) ? integerYear - 1 : integerYear;
      int secondYear = integerYear;
      int thirdYear = (integerMonth == 12) ? integerYear + 1 : integerYear;
      
      int firstMonth = (integerMonth == 1) ? 12 : integerMonth - 1;
      int secondMonth = integerMonth;
      int thirdMonth = (integerMonth == 12) ? 1 : integerMonth + 1;
      
      LocalDate FirstDate = LocalDate.of(firstYear, firstMonth, 1);
      LocalDate SecondDate = LocalDate.of(secondYear, secondMonth, 1);
      LocalDate ThirdDate = LocalDate.of(thirdYear, thirdMonth, 1);
      
      int firstLastDate = FirstDate.lengthOfMonth();
      int secondLastDate = SecondDate.lengthOfMonth();
      int thirdLastDate = ThirdDate.lengthOfMonth();
      
      DayOfWeek firstDayOfWeek = FirstDate.getDayOfWeek();
      int firstDayNumber = firstDayOfWeek.getValue(); // 금 5
      DayOfWeek secondDayOfWeek = SecondDate.getDayOfWeek();
      int secondDayNumber = secondDayOfWeek.getValue();
      DayOfWeek thirdDayOfWeek = ThirdDate.getDayOfWeek();
      int thirdDayNumber = thirdDayOfWeek.getValue();
      
      int firstResultDayNumber = 0;
      int secondResultDayNumber = 0;
      int thirdResultDayNumber = 0;
      
      for (int i = 0; i < 7; i++)
      {
          if (i == 0)
          {
              String firstResult = " [" + firstYear + "년 " + String.format("%02d", firstMonth) + "월" + "]";
              System.out.printf("%s\t\t\t\t\t\t\t\t", firstResult);
              String secondResult = "[" + secondYear + "년 " + String.format("%02d", secondMonth) + "월" + "]";
              System.out.printf("%s\t\t\t\t\t\t\t\t", secondResult);
              String thirdResult = " [" + thirdYear + "년 " + String.format("%02d", thirdMonth) + "월" + "]";
              System.out.printf("%s", thirdResult);
              System.out.println();
          }
          
          else if (i == 1)
          {
              String dayResult = "일\t월\t화\t수\t목\t금\t토";
              System.out.printf(" %s\t\t\t", dayResult);
              System.out.printf("%s\t\t\t", dayResult);
              System.out.printf(" %s", dayResult);
              System.out.println();
          }
          
          else if (i == 2)
          {
              for (int j = 0; j < 7; j++)
              {
                  if (firstDayNumber == 7)
                      firstDayNumber = 0;
                  
                  if (firstDayNumber > j)
                      System.out.printf("\t");
                  
                  else
                  {
                      firstResultDayNumber++;
                      System.out.printf("%s", String.format("%02d", firstResultDayNumber));
                      System.out.printf("\t");
                  }
                      
              }
              
              System.out.printf("\t");
              System.out.printf("\t");
              
              for (int j = 0; j < 7; j++)
              {
                  if (secondDayNumber == 7)
                      secondDayNumber = 0;
                  
                  if (secondDayNumber > j)
                      System.out.printf("\t");
                  
                  else
                  {
                      secondResultDayNumber++;
                      System.out.printf("%s", String.format("%02d", secondResultDayNumber));
                      System.out.printf("\t");
                  }
                      
              }
              
              System.out.printf("\t");
              System.out.printf("\t");
              
              for (int j = 0; j < 7; j++)
              {
                  if (thirdDayNumber == 7)
                      thirdDayNumber = 0;
                  
                  if (thirdDayNumber > j)
                      System.out.printf("\t");
                  
                  else
                  {
                      thirdResultDayNumber++;
                      System.out.printf("%s", String.format("%02d", thirdResultDayNumber));
                      System.out.printf("\t");
                  }
                      
              }
              
              System.out.println();
          }
          
          else if (i > 2)
          {
              System.out.print(" ");
              
              for (int j = 0; j < 7; j++)
              {
                  firstResultDayNumber++;
                  
                  if (firstResultDayNumber <= firstLastDate)
                  {
                      System.out.printf("%s", String.format("%02d", firstResultDayNumber));
                      System.out.printf("\t");
                  }
                  
                  else
                      System.out.printf("\t");
              }
              
              System.out.printf("\t");
              System.out.printf("\t");
              
              for (int j = 0; j < 7; j++)
              {
                  secondResultDayNumber++;
                  
                  if (secondResultDayNumber <= secondLastDate)
                  {
                      System.out.printf("%s", String.format("%02d", secondResultDayNumber));
                      System.out.printf("\t");
                  }
                  
                  else
                      System.out.printf("\t");
              }
              
              System.out.printf("\t");
              System.out.printf("\t");
              System.out.print(" ");
              
              for (int j = 0; j < 7; j++)
              {
                  thirdResultDayNumber++;
                  
                  if (thirdResultDayNumber <= thirdLastDate)
                  {
                      System.out.printf("%s", String.format("%02d", thirdResultDayNumber));
                      System.out.printf("\t");
                  }
              }
              
              System.out.println();
          }
      }
  }

}
