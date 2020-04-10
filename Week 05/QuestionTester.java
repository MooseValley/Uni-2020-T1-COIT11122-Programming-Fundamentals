public class QuestionTester
{
   public static void main(String[] args)
   {
      Question question = new Question();
      boolean exit = false;

      while (exit == false)
      {
         question.askQuestion ();

         exit = question.doesUserWantToExitProgram ();
         if (exit == false)
         {
            question = new Question();
         }
      }

      System.out.println ("Have a nice day !");
   }
}