This repository is the upgraded version of Bigger hand game problem.
Problem description is given below.

Simple game of cards.

Bigger hand wins the game. Imagine a game of playing cards wherein only 2 players play the game. From the deck of 52 cards, each player is given 2 cards randomly. In this simple game, whichever player gets a bigger hand of cards, wins the game. Bigger hand is decided by following rules.

1. Each number card carries same points as the number on it. Each face card carries points as follows: J-11, Q-12, K-13 and Ace - 14. 
2. For each set of 2 cards, you need to add up the points associated with each card they have.

Example: Player A as 10 of Hearts and Q of Clubs while Player B has 9 of Spade and J of Spade.

Player A will score 10 + 12 = 22 points and Player B will score 9 + 11 = 20 points. Player A will win this hand.

Keeping above mind in logic, write a class in Java with following methods:

public int determineWinner(String handA, String handB) { }

handA and handB are two or character strings like: 5H (indicates 5 of hearts) QC (indicates Queen of Clubs). This method should return 1 if handA wins and 2 if handB wins. It should return 0 in case of tie. It should also throw an exception if handA or handB are not valid strings denoting a card.
