# Premature Exit from Main Method After Catching Exception

This repository demonstrates a subtle bug in Java where a return statement within a catch block prematurely exits the main method, preventing the execution of code that comes after the catch block.

The `bug.java` file shows the problematic code.  The `bugSolution.java` file provides a corrected version.

This type of error can be difficult to detect because it may not immediately produce a crash or obvious error message.  The program simply appears to stop executing unexpectedly.