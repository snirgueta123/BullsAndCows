# Bulls and Cows Game

A fun implementation of the classic "Bulls and Cows" game, where players try to guess a secret 4-digit number based on feedback provided for each guess.

## About the Game
"Bulls and Cows" is a logic-based guessing game:
- **Bulls**: Digits that are correct and in the correct position.
- **Cows**: Digits that are correct but in the wrong position.

For example:
If the secret number is `1307` and the guess is `3201`, the result would be:
- **1 Bull**: (0 is in the correct position).
- **2 Cows**: (3 and 1 are correct but in the wrong positions).

## How to Play
1. The program generates a secret 4-digit number with no repeated digits.
2. Players input their guesses.
3. The program provides feedback for each guess (number of Bulls and Cows).
4. The game continues until the player guesses the correct number.
5. After winning, the player is asked whether they want to play again.

## Rules
1. Only valid 4-digit numbers with no repeated digits are accepted as guesses.
2. Invalid input results in an error message and the player is prompted to guess again.
3. Players can keep guessing until the secret number is guessed correctly.

## Example Gameplay
Welcome to Bulls and Cows! I have selected a 4-digit number. Try to guess it!

Enter your guess: 3201 1 Bull and 2 Cows.

Enter your guess: 1307 4 Bulls! You guessed it! Congratulations!

shell
Copy code

## Setup and Running the Project
### Prerequisites
- Java Development Kit (JDK) installed.
- A Java IDE or terminal.

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/snirgueta123/BullsAndCows.git
