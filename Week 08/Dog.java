/*
Author: Mike OMalley
Source: MeanMedian.java

Java - Basic Console App - Week 08
Question Two
a. Create a class called Dog which has two instance variables dogName as a string and dogAge as an integer.
b. Add a default constructor and a parameterised constructor.
c. Add get and set methods
d. Create another class in the same folder called Dogs, in Dogs create an array of three Dog objects
e. In the Dogs class's constructor populate the array (using new and the parameterised constructor) use: Fido, 3; Rover, 8 and Deefer, 2;
f. Create a main method in Dogs and create an object of type Dogs.
g. Create a method in Dogs displayDogs to display the three dogs.
h. Call the method displayDogs in the main using the Dogs object you have created in section f.

Mike O's extensions:
-> Dog class: add toString()
-> Dogs class: change Array -> ArrayList
-> Dogs class: add methods: add (String, int), get (String), search (String), remove (String), toString(), ...
-> Move main to DogsTester class: a 3 class project !
-> Almost a mini-database !  (Add saveToFile, loadFromFile, etc and almost there !)


   DogTester (UI, Console App)
      |
     Dogs (array)
      |
     Dog (data)

Review:  Very Important
- Where does the data for a Dog reside ?
- Where does the array reside ?
- If validation rules had to be added for Dog name and age, where would these be added ?  i.e. which class would be responsible for validating Dog data ?
- If error messages needed to be displayed to the user for any validation errors, which class would be responsible for displaying these errors ?
- If we needed to save dog data to file / load data from file, where would we put the save() and load() methods ?
- If we changed from a Console App to a GUI App, Web App, etc what class(es) would we need to change ?



*/