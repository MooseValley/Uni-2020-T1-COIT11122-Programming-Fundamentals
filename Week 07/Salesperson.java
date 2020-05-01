/*
6. a. Create a class named Salesperson. Data fields for Salesperson include an integer
ID number and a double annual sales amount.Methods include a constructor that
requires values for both data fields, as well as get and set methods for each of the
data fields.  Write an application named DemoSalesperson that declares an array of
10 Salesperson objects. Set each ID number to 9999 and each sales value to zero.
Display the 10 Salesperson objects. Save the files as Salesperson.java and
DemoSalesperson.java.

b. Modify the DemoSalesperson application so each Salesperson has a successive
ID number from 111 through 120 and a sales value that ranges from $25,000 to
$70,000, increasing by $5,000 for each successive Salesperson. Save the file as
DemoSalesperson2.java.
*/
public class Salesperson
{
   private int    idNumber;
   private double annualSales;

   public Salesperson ()
   {
      this(0, 0.0);
   }

   public Salesperson (int idNumber, double annualSales)
   {
      this.idNumber    = idNumber;
      this.annualSales = annualSales;
   }

   public int getIdNumber ()
   {
      return idNumber;
   }

   public double getAnnualSales ()
   {
      return annualSales;
   }

   public void setIdNumber (int idNumber)
   {
      this.idNumber    = idNumber;
   }

   public void setAnnualSales (double annualSales)
   {
      this.annualSales = annualSales;
   }

   public String toString()
   {
      return "Sales person: " + String.format ("%4d",     idNumber) +
             ":    $"         + String.format ("%,12.2f", annualSales);
   }

}  // public class Salesperson