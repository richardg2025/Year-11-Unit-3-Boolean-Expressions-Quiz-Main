# Year-11-Unit-3-Boolean-Expressions-Quiz-Main

Ensure that you read all instructions carefully. Do not include any additional methods that are not specified in this quiz description. Think carefully about your solution before writing any code. Use meaningful variable names and proper indentation - take pride in your work! Good luck, have fun! :)

1. Inside the Main class, complete the method calculateGrade. This method will take an integer argument and return a character that corresponds to the letter grade associated with a score. 

90 and above = A

80 to 89 = B

70 to 79 = C

60 to 69 = D

50 to 59 = E

49 and below = F

calculateGrade(90);	// Returns ‘A’

calculateGrade(79);	// Returns ‘C’

2. Inside the Main class, complete the method fizzBuzz. This method will take an integer argument and return a String depending on the divisibility of the argument passed. This method will return “fizz” if the value is divisible by 3, “buzz” if the value is divisible by 5, “fizzbuzz” if the value is divisible by both 3 and 5, and “unlucky” if the number is not divisible by 3 or 5.

fizzBuzz(3);	// Returns “fizz”

fizzBuzz(5);	// Returns “buzz”

fizzBuzz(15); 	// Returns “fizzbuzz”

fizzBuzz(16);	// Returns “unlucky”

3. Inside the Main class, complete the method frontBack. This method will take a String as an argument and return a String that has the first two characters of the original string passed added to the front and to the end of the original string. If the argument is less than two characters in length, return the argument. 

frontBack(“hello”);	// Returns “hehellohe”

frontBack(“hi”);	// Returns “hihihi”

frontBack(“g”);		// Returns “g”

4. Inside the Main class, complete the method twoAsOne. This method will take three integers as arguments and return a boolean value depending on whether any two of the three integers can be added together to equal the third. 

twoAsOne(1,2,3); 	// Returns true as 1+2=3

twoAsOne(4,11,-7);	// Returns true as 11+-7=4

twoAsOne(4,6,12);	// Returns false


5. Inside the Main class, complete the method endUp. This method will take a String as an argument and return a string where the last three characters have been capitalized. If there are less than three characters in the argument, then capitalize all of the characters. 

endUp(“hello”);	// Returns “heLLO”

endUp(“for sure”);	// Returns “for sURE”

endUp(“gg”);		// returns “GG”
