# hangman-word
Exploration into a good hangman word

[Hangman][hangman] is a 

> paper and pencil guessing game for two or more players. One player thinks of a
> word, phrase or sentence and the other tries to guess it by suggesting letters
> or numbers, within a certain number of guesses. 

This repository aims to answer the question: "What is a good hangman word?"

## Considerations
We will call the word that needs to be guessed the **target word**. The state of
a game of hangman is described by the following parts 

* **the clue**: a clue provides information about the target word `_e_l_g`.
* **chosen letters**: a set of letters that where guessed, but are not in the
  target word.

A good word for hangman is a word that needs a lot of guesses for a certain
strategy. 

## On strategy
For every target word there is a strategy that just guesses the letters of that
specific word. This means that we should specifiy our strategy we use in order
to say which words are good. 

We will adopt the following strategy. Given a clue and our chosen letters there
is a set of words that are still possible. For every available letter, i.e. the
letters that are not in the clue and are not in the chosen letters, two sets new
sets will be formed 

1. The set of words that do contain that letter.
2. The set of words that do **not** contain that letter.

We will argue that the best strategy of this form will choose the letter that
makes these sets as small as possible. Because these two sets are complimentary
in the set of words that we started with, if we want to minimize the size of
them both, they should be equal in size. 

You can see this is the case by playing a different game. Instead of chosing a
target word at the beginning, that player can keep changing her mind, as long as
it is consistent with the history of the game. 

[hangman]: https://en.wikipedia.org/wiki/Hangman_%28game%29
