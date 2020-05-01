/*
 Author: Mike O
 File:   PassByValuePassByReference.java
 Desc:   Week 07: basic example to explore

For now, if you don't want method changing your Employee or
array or whatever reference type, create a copy and pass the copy.
Example:
   Employee e1     = new Employee ("Mike", 123);
   Employee e1Copy = new Employee (e1.getName(), e1.getStudId() );
   changeEmployee (e1Copy);

Or create a Copy Constructor ...

All of this is going beyond the scope of what we cover in this course ...

To Explore / to think about:
 * final - in object delcaration
 * final - in method header where object is passed

* What does final mean ???

   final int MAX = 5;
   MAX = 6; // ERROR

   final Employee e2 = new Employee ("Mike", 123); // What is e2 ?

   e2 = new Employee ("Bella", 789); // Is this allowed ???  ERROR

   e2.setName ("Samuel");          // Is this allowed ???   YES
   e2.setId   (555);


Joshua Bloch's Effective Java:
advanced Java topics ....
"Item 13 Override clone judiciously"
* clone method / Cloneable, copying objects, Copy Constructor, etc
http://books.google.com/books?id=ka2VUBqHiWkC&pg=PA55&lpg=PA55&dq=effective+java+clone&source=bl&ots=yXGhLnv4O4&sig=zvEip5tp5KGgwqO1sCWgtGyJ1Ns&hl=en&ei=CYANSqygK8jktgfM-JGcCA&sa=X&oi=book_result&ct=result&resnum=3#PPA54,M1
For after you finish the follow on Java course.

*/
import java.time.LocalDate;
import java.util.Arrays;

public class PassByValuePassByReference
{
   public static void passInt (int val)
   {
      val = 999;
   }

   public static void changeIntArray (int[] array)
   {
      array [0] = 99;
   }

   // Employee is NOT immutable
   public static void changeEmployee (Employee emp)
   {
      emp.setName ("Frankie");
      emp.setId   (567);
   }

   // String is immutable
   public static void changeString (String str)
   {
      str = "I Feel Changed !!!";
   }

   // LocalDate is an immutable date-time object
   public static void changeLocalDate (LocalDate date)
   {
      //date = LocalDate.of (2000, 01, 01); // 1-Jan-2000
      date = date.plusYears  (5);
   }

   public static void main (String[] args)
   {
      int val = 23;
      System.out.println ("Int       Before: " + val);
      passInt (val);
      System.out.println ("       -> After:  " + val);

      int[] intArray = {10, 20, 30};
      System.out.println ("Int Array Before: " + Arrays.toString(intArray) );
      changeIntArray (intArray);
      System.out.println ("       -> After:  " + Arrays.toString(intArray) );


      Employee e1 = new Employee ("Mike", 123);
      System.out.println ("Employee  Before: " + e1.toString() );
      changeEmployee (e1);
      System.out.println ("       -> After:  " + e1.toString() );

      String name = "Mike";
      System.out.println ("String    Before: " + name);
      changeString (name);
      System.out.println ("       -> After:  " + name);

/*
      LocalDate myDate = LocalDate.now();
      System.out.println ("LocalDate Before: " + myDate);
      changeLocalDate (myDate);
      System.out.println ("       -> After:  " + myDate);
*/
   }
}