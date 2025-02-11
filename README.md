# Groovy List Modification During Iteration

This repository demonstrates a common error in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The code attempts to remove an element if it's equal to 2. However, removing an element from the list during iteration disrupts the index tracking, leading to incorrect results or exceptions.

The `bug.groovy` file contains the problematic code, and `bugSolution.groovy` offers a corrected version.

## How to reproduce
1. Clone the repository.
2. Run `groovy bug.groovy` (you'll see unexpected output)
3. Run `groovy bugSolution.groovy` (you'll see the intended output)

## Solution
The solution involves using an iterator to safely remove elements, or using a different approach such as creating a new list.
