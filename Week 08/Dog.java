/*
Author: Mike OMalley
Source: Dog.java

Java - Basic Console App - Week 08
Question Two
a. Create a class called Dog which has two instance variables dogName as a string and dogAge as an integer.
b. Add a default constructor and a parameterised constructor.  this shortcut
c. Add get and set methods

d. Create another class in the same folder called Dogs, in Dogs create an array of three Dog objects
e. In the Dogs class's constructor populate the array (using new and the parameterised constructor) use: Fido, 3; Rover, 8 and Deefer, 2;
f. Create a main method in Dogs and create an object of type Dogs.
g. Create a method in Dogs displayDogs to display the three dogs.
h. Call the method displayDogs in the main using the Dogs object you have created in section f.

Mike O's extensions:
Mike O's extensions:
-> Dog class: add toString()
-> Dogs class: change Array -> ArrayList
-> Dogs class: add methods: add (String, int), get (String), search (String), sort(), remove (String), toString(), ...
-> Move main to DogsTester class: a 3 class project !
-> Almost a mini-database !  (Add saveToFile, loadFromFile, etc and almost there !)


   DogTester (UI, Console App)
      |
     Dogs (array)
      |
     Dog (data)

Review:  Very Important
- Where does the data for a Dog reside ?
Dog

- Where does the array reside ?
Dogs

- If validation rules had to be added for Dog name and age, where would these be added ?  i.e. which class would be responsible for validating Dog data ?
Dog
Setters and the Constructors


- If error messages needed to be displayed to the user for any validation errors, which class would be responsible for displaying these errors ?

Dog or the Dogs class might generate the error message or indicate that an error has occured - but ideally it should not display it

DogTester
User Interface class - Console App or a GUI
that should be responsible for displaying the error messages
- console screen, Swing dialog, Label on the user interface, etc


- If we needed to save dog data to file / load data from file, where would we put the save() and load() methods ?
Dogs class
this class is responsible for the array of Dog data.

load or save might be called from User Interface class - user clicks "Load" or "Save" buttons, etc
but the actual code for the save() abd load() definitely belongs in the Dogs class.


- If we changed from a Console App to a GUI App, Web App, etc what class(es) would we need to change ?

Q. wouldn't we have to change dog and dogs slightly to move from console input to GUI input?


Students TODO:
* research ArrayList help and see if there are built-in methods to help
* Dogs.toString()
* Week 11 File I/O: add Dogs saveToFile and loadFromFile methods and call these from the main in Console App or the Constructor in the GUI

*/
public class Dog
{
   private String dogName;
   private int    dogAge;

   // Default Constructor - special thanks to Andrew !! :)
   public Dog()
   {
      //dogName = null;
      //dogAge  = 0;
      this ("", 0);
   }

   // Parameterised Constructor - special thanks to Andrew !! :)
   public Dog(String dogName, int dogAge)
   {
      this.dogName = dogName;
      this.dogAge  = dogAge;
   }


   // Accessor methods - special thanks to Andrew !! :)
   public String getDogName()
   {
      return dogName;
   }

   public int getDogAge()
   {
      return dogAge;
   }

   public String toString()
   {
      return "Dog name is: " + dogName + " and the dogs age is: " + dogAge;
   }

   // Mutator Methods - special thanks to Andrew !! :)
   public void setDogName(String dogName)
   {
      this.dogName = dogName;
   }

   public void setDogAge(int dogAge)
   {
      this.dogAge = dogAge;
   }

} // public class Dog