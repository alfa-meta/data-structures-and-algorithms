
Data Structure - data encountered in a computer program classified by its type.
	Common types include integers, floating point numbers, Boolean values, and characters.

Algorithm - an explicit sequence of instructions, performed on data, to accomplish a desired objective.


## Three Primary Cases of Concern When Analysing Algorithms

- Worst Case - the maximum amount of operations you can do. Example O(n)
- Average Case - this function describes what we would typically have to do when performing an algorithm many times.
- Amortised Case - arises whenever you have an expensive set of operations that only occur sometimes.


## Big O

![[Pasted image 20260416055929.png]]

## Big-Omega

![[Pasted image 20260416055957.png]]

## Big-Theta

![[Pasted image 20260416060016.png]]

## Exercises

1. For each card in the deck:
	1. Check that the card is facing up.
	2. If not, make it face up.
	3. Put the card into a new deck pile where all cards are facing up.

2. Problem 2:
	a. Inspection = 1 op, Flip = 1 op.
	b. Max number of ops is 2
	c. Meaning the Cost function would be O(n) = 2n == n
	And the change would be m

4. Exercise 3
	a. O(n)
	b. O(n)
	c. O(1)
	d. O(n<sup>2</sup>)