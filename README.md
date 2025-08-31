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
Output: 0 1 1 2 3

### Multiple Numbers Input
Enter 3 numbers: 4 6 8
Choice: Trib
Output:
0 0 1 1
0 0 1 1 2 4
0 0 1 1 2 4 7 13

### Factorial with BigInteger
Enter number: 100
Choice: Fact
Select type: BigInteger
Output: 933262154439441526816992388562667004907159682643816214...


## Getting Started
1. Clone the repository:```bash -- git clone https://github.com/<your-username>/<repo-name>.git
2. Open in your preferred Java IDE (Eclipse, IntelliJ, etc.).
3. Run combined_logic.java and follow the prompts.


### Future Improvements
Add more mathematical sequences (e.g., Catalan numbers, Pell numbers).
Add graphical display of sequences.
Add unit tests for automated validation of results.
