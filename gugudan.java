
public class gugudan {

  public static void main(String[] args) 
  {
     for (int i = 1; i < 10; i++) 
    {
      for (int j = 1; j < 10; j++) 
      {
        String iResult = String.format("%02d", i);
        String jResult = String.format("%02d", j);
        String ijResultString = String.format("%02d", i * j);
        System.out.print(jResult + " x " + iResult + " = " + ijResultString);
        System.out.print("\t");
      }
      System.out.print("\n");
    }

  }

}
