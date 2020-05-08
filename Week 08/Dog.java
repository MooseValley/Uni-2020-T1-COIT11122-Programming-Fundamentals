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
-> Demo re-use - if we changed Console App to a GUI App, Web App, etc.

Review:
- Where does the data for a Dog reside ?
- If validation rules had to be applied for a Dog name and age, where would these be applied ?  i.e. which class would be responsible for validating Dog data ?
*/