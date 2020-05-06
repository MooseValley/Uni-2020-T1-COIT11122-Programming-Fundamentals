/*
 Author: Mike O
 File:   Employee.java
 Desc:   Basic class for an Employee.

UML Class Diagram
short summary of your class

-----------------------------------
Employee
-----------------------------------
-<static>MAX_ID: int, 999
-id: int
-name: String
-traininghistory: TrainingHistory[]
-----------------------------------
<<constructor>>Employee()
<<constructor>>Employee (String name)
<<constructor>>Employee (int id)
<<constructor>>Employee (String name, int id)
+setId (int id): void
+setName (String name): void
+getId (): int
+getName (): String
+toString (): String
-----------------------------------

Key:
- private
+ public
<<constructor>> Constructor
<static> Static class methods / fields


*/
public class Employee
{
   private static final int MAX_ID = 999;

   private int    id;
   private String name;

   // Default Constructor
   public Employee ()
   {
      this ("", 0);
   }

   // Parameterised Constructor #1
   public Employee (String name)
   {
      this (name, 0);
   }

   // Parameterised Constructor #2
   public Employee (int id)
   {
      this ("", id);
   }

   // Parameterised Constructor #3
   public Employee (String name, int id)
   {
      this.id     = id;
      this.name   = name;
   }


   // *** Mutators / Setters

   public void setId (int id)
   {
      this.id = id;
   }

   public void setName (String name)
   {
      this.name = name;
   }


   // *** Accessors / Getters

   public int getId ()
   {
      return id;
   }

   public String getName ()
   {
      return name;
   }

   public String toString ()
   {
      return name + " (" + id + ")";
   }

} // public class Employee
