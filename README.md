# Toy Robot
## Overview
Toy Robot application is a simple Java application with command line interface.
It has 4 components:
1. Application main logic is in ToyRobot class
2. Command is to control the robot
3. Constant is to store constant values
4. Model is to exchange data between Application main logic and command components
 
## How it is built
This application is built based on TDD. After many test cases based on requirements were created and passed tested, the application contained full of of if statements and were refactored to multiple interfaces and classes refactored by using Polymorphism.
Then additional test cases were created to fulfill code coverage.  
## Usage
1. From IDE, navigate to package au.com.robot > Run ToyRobot
   or from Terminal, navigate to toyrobot/src/target and run command ```java -jar toyrobot-1.0.jar```
2. Enter valid command lines to operate the Robot. The valid commands are below:
    
    1. PLACE X,Y,F
    2. MOVE
    3. LEFT
    4. RIGHT
    5. REPORT
    6. QUIT (to quit the application)

    
  

