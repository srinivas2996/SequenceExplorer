# Java Sequence Calculator

A simple Java program that allows users to generate **Fibonacci**, **Tribonacci**, and **Factorial** sequences. The program supports both **single number** and **multiple numbers** input.

## Features

- **Fibonacci Sequence:** Generates the first N numbers of the Fibonacci sequence.  
- **Tribonacci Sequence:** Generates the first N numbers of the Tribonacci sequence.  
- **Factorial Calculation:** Computes factorials, supporting both `int` and `BigInteger` for large numbers.  
- **User-friendly input:**  
  - Choose between a single number or multiple numbers.  
  - Choose the calculation type: Fibonacci, Tribonacci, or Factorial.  
  - For factorials, select standard `int` or `BigInteger` for very large results.

## Example Usage
### Single Number Input
Enter a single number: 5
Choice: Fib
Output: Fibonacci sequence for 5: 0 1 1 2 3

### Multiple Numbers Input
Enter 3 numbers: 4 6 8
Choice: Trib
Output:
Tribonacci sequence for 4: 0 0 1 1 
Tribonacci sequence for 6: 0 0 1 1 2 4 
Tribonacci sequence for 8: 0 0 1 1 2 4 7 13 

### Factorial with BigInteger
Enter number: 100
Choice: Fact
Select type: BigInteger
Output: Factorial of 100 is: 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000

### Factorial with BigInteger for Multiple Numbers Input
Enter 3 numbers: 55 68 5
Choice: Fact
Output: 
Factorial of 55 is: 12696403353658275925965100847566516959580321051449436762275840000000000000
Factorial of 68 is: 2480035542436830599600990418569171581047399201355367672371710738018221445712183296000000000000000
Factorial of 5 is: 120

## Getting Started
1. Clone the repository:```bash -- git clone https://github.com/<your-username>/<repo-name>.git
2. Open in your preferred Java IDE (Eclipse, IntelliJ, etc.).
3. Run combined_logic.java and follow the prompts.


### Future Improvements
Add more mathematical sequences (e.g., Catalan numbers, Pell numbers).
Add graphical display of sequences.
Add unit tests for automated validation of results.
