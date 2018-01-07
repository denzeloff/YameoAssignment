This is a repository containing a task for the internship candidates at yameo.

This repository contains simple Java based project.
The code in this project breaks some of the good design principles - SOLID, DRY, etc. and contains some bugs.

The assignment task is as follows:

1. Please refactor this code so that it follows good design patterns / principles. 
Please fix bugs as you find them. This example is very short, so your solution may seem robust and in some cases over-engineered. This is understandable and will not have a negative impact on the final evaluation of your work.
2. **Please do not rewrite the whole solution from the beginning**. 
Please do work on the existing code and refactor it. 
Please document your changes step by step in the way you find the most convenient.
3. Please add at least one additional shape to the application (you may try adding one before and one after your modifications). 
4. The **deadline** for this assignment is **January the 7th 2018 23:59 CET**. 
Please submit your answer in the way you find the most convenient (email, github / bitbucket / other repo).
5. In case you don't know how the solution should work / behave, 
please use your best judgement and very shortly document / describe the reason behind your choice.

GLHF!

My Changes:

At the beginning I started the program to familiarize myself with its operation, 
then I found wrong implementation of calculatedArea and calculatedPerimeter. I swapped them.
Then, for better readability of the code, I split the classes into packages. 
I also deleted inheritance in Circle and Square Class and replace it with implements Shape interface.
I separate readDouble() and readInteger() to enum ReaderService.
I changed in model classes type from Double to primitive double, because I don't no why I should use object type here.
I looked on Triangle test and I write isPossible method for this class which return true if we can create a Triangle or false if we can't.
I implemented this method in Triangle constructor which throws exception if we can't create the triangle from the given edges.
I add some changes in SquareTest.
From geometry App class in modifyShape method I changed instanceof checking with adding new method modify in Shape interface.
I have added ShapesCreatorService to separate it from GeometryApp.
I created enum with all Shapes, and ShapeFactory class where we have method which returns new Shape depending on user choice or null if the user chose incorrect shape.
