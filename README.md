# DigitlessPassWord
Digitless password length calculator

Description: 

The purpose of this project is to create a function, effeciently with as little code as possible, that takes in a string and calculates the number of characters in the longest possible password.

 The password has to follow 2 rules: 

  1. It needs to contain at least 1 capital letter 
  2. It cannot have any digits. 
  
This means that if the string is "bA0Xaa", the longest password would be Xaa since string gets split everytime there is a digit, and the function will return the number 3. If there is no possibile password that fits the two conditions, the function will return -1.
