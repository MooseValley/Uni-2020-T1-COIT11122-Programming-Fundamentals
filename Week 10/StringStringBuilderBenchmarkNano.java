/*
Author: Textbook (mostly)
Source: StringStringBuilderBenchmarkNano.java

Nanosecond = 10^-9 seconds
Millsecond = 10^-3 seconds
==> 1 Nanosecond = 1,000,000 Millseconds


*** Sample Output:

Time with Default StringBuilder: 0 milliseconds
Time with Pre-Allocated StringBuilder: 0 milliseconds
Time with String: 450 milliseconds

*/
import java.time.*;
public class StringStringBuilderBenchmarkNano
{
   public static void main(String[] args)
   {
      final String STRING_TO_APPEND     = "Java";
      final int LOOP_ITERATIONS         = 1_000_000;
      final int NANOSEC_PER_MILLISEC    = 1_000_000;
      long startTime, endTime;
      StringBuilder stringBuilder1 = new StringBuilder ();
      StringBuilder stringBuilder2 = new StringBuilder (LOOP_ITERATIONS * STRING_TO_APPEND.length() );
      String        string3        = "";

      // Default StringBuilder:
      startTime = LocalDateTime.now().getNano();
      for(int x = 0; x < LOOP_ITERATIONS; ++x)
         stringBuilder1.append(STRING_TO_APPEND);
      endTime = LocalDateTime.now().getNano();
      System.out.println("Time with Default StringBuilder: " +
         ((endTime - startTime) / NANOSEC_PER_MILLISEC + " milliseconds"));

      // Pre-Allocated StringBuilder
      startTime = LocalDateTime.now().getNano();
      for(int x = 0; x < LOOP_ITERATIONS; ++x)
         stringBuilder2.append(STRING_TO_APPEND);
      endTime = LocalDateTime.now().getNano();
      System.out.println("Time with Pre-Allocated StringBuilder: " +
         ((endTime - startTime) / NANOSEC_PER_MILLISEC + " milliseconds"));

      // String
      startTime = LocalDateTime.now().getNano();
      for(int x = 0; x < LOOP_ITERATIONS; ++x)
         string3 += STRING_TO_APPEND;
      endTime = LocalDateTime.now().getNano();
      System.out.println("Time with String: " +
         ((endTime - startTime) / NANOSEC_PER_MILLISEC + " milliseconds"));

   }
}
