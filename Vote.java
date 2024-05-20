/*
 * 김은정
 * 미니과제 6번
 */
import java.util.*;

public class vote {

  public static void main(String[] args) 
  {
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();
     
     System.out.print("총 진행할 투표수를 입력해 주세요.");
     String poll = scanner.nextLine();
     int convertToIntPoll = Integer.parseInt(poll);
     double convertToDoublePoll = Double.parseDouble(poll);
     
     System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
     String candidateNumber = scanner.nextLine();
     int convertCandidateNumber = Integer.parseInt(candidateNumber);
     
     Map<Integer, String> candidates = new HashMap<Integer, String>();
     int[] votes = new int[convertCandidateNumber];
     int election = 0;
     
     for (int i = 0; i < convertCandidateNumber; i++)
     {
        System.out.printf("%d번째 후보자 이름을 입력해 주세요.", i + 1);
        String candidateName = scanner.nextLine();
        candidates.put(i + 1, candidateName);
     }
     
     System.out.println();
     
     double currentProgress;
     
     for (int i = 1; i < convertToIntPoll + 1; i++)
     {
        int result = random.nextInt(convertCandidateNumber) + 1;
        int number = result - 1;
        votes[number] = votes[number] + 1;
        
        currentProgress = ((double)i / convertToDoublePoll) * 100.0;
        
        int maxVote = 0;
        
        for (int j = 0; j < convertCandidateNumber; j++)
        {
           if (maxVote < votes[j])
           {
              maxVote = votes[j];
              election = j;
           }
        }

        System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s", currentProgress, i, candidates.get(result));
        System.out.println();
        
        for (int j = 0; j < convertCandidateNumber; j++)
        {
           System.out.printf("[기호:%d] %s:\t%.2f%%\t(투표수: %d)", j + 1, candidates.get(j + 1), votes[j] == 0 ? 0.00 : ((double)votes[j] / convertToDoublePoll) * 100.0, votes[j]);
           System.out.println();
        }
        
        System.out.println();
     }
     
     System.out.printf("[투표결과] 당선인 : %s", candidates.get(election + 1));
  }

}
