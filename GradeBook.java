import java.util.ArrayList;

public class GradeBook
{
   private int[] scores;
   private int scoreSize;

   /** 
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new int[capacity];
      scoreSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(int score)
   {
      if (scoreSize < scores.length)
      {
         scores[scoreSize] = score;
         scoreSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoreSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      if (scoreSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoreSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoreSize == 0)
         return 0;
      else if (scoreSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   public  int getScoreSize()
   {
	   return scoreSize;
   }
   
   public String  toString() {
	  String str = "";
	  for (int i = 0; i < scoreSize; i++) {
		str +=  scores[i] + " ";   
   }
	   return str;

}	  
}