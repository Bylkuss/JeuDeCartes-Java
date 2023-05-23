# JeuDeCartes-Java
<p align="center">
    <a href="https://www.cprogramming.com/"><img alt="Made with Java" src="https://img.shields.io/badge/Made%20with-Java-1f425f.svg"/></a>
    <img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/bylkuss/JeuDeCartes-Java?color=lightblue" />
    <img alt="Number of lines of code" src="https://img.shields.io/tokei/lines/github/bylkuss/JeuDeCartes-Java?color=critical" />
    <img alt="Code language count" src="https://img.shields.io/github/languages/count/bylkuss/JeuDeCartes-Java?color=yellow" />
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/bylkuss/JeuDeCartes-Java?color=blue" />
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/bylkuss/JeuDeCartes-Java?color=green" />
</p>

## Carte Class

The `Carte` class represents a playing card with a value and a suit. It provides methods to set and retrieve the value and suit of a card.

### Usage
To create a new Carte object, use the following constructor:
```
Carte carte = new Carte(valeur, couleur);
```

Where `valeur` is an integer representing the value of the card (between 1 and 13), and `couleur` is a string representing the suit of the card ("pique", "trèfle", "carreau", or "coeur").

<br>

### Public Methods
```
getValeur()
```
This method returns the value of the card as an integer.
```
getCouleur()
```
This method returns the suit of the card as a string.

<br>

### Private Methods
```
setValeur(int valeur)
```
This private method is used to set the value of the card. It checks if the provided value is valid (between 1 and 13) and throws an IllegalArgumentException if not.
```
setCouleur(String couleurCarte)
```
This private method is used to set the suit of the card. It checks if the provided suit is valid (one of "pique", "trèfle", "carreau", or "coeur") and throws an IllegalArgumentException if not.
```
laValeurEstValide(int valeur)
```
This static method checks if a given value is valid for a card. It returns true if the value is between 1 and 13 (inclusive), and false otherwise.
```
laCouleurEstValide(String couleurCarte)
```
This static method checks if a given suit is valid for a card. It returns true if the suit is one of "pique", "trèfle", "carreau", or "coeur", and false otherwise.

<br>

## Util Class
The `Util` class provides various utility methods for performing common operations.

### Methods
```
trouverStr(String strTb1, String[] t1Str)
```
This static method searches for a string strTb1 within an array of strings t1Str. It returns the index of the string if found, or -1 if not found.
```
getNombreAleatoireEntreBorne(int min, int max)
```
This static method generates a random integer between the specified min and max values (inclusive). If min is greater than or equal to max, an IllegalArgumentException is thrown.
```
lireEntierValide(String question, int valeurMin, int valeurMax)
```
This static method prompts the user with a question and reads an integer input from the console. It validates that the input is within the specified valeurMin and valeurMax range. If the input is valid, it returns the validated response. If the input is outside the range, appropriate error messages are displayed, and the user is prompted again until a valid input is provided.
```
lireEntier(String question)
```
This static method prompts the user with a question and reads an integer input from the console. It returns the parsed integer value of the input.
```
lireString(String question)
```
This static method prompts the user with a question and reads a string input from the console. It returns the input as a string.

***********************************************
 <footer>
    <p align=center style="float:left; width: 20%;">
        &copy; Lounes Adjou, 2020
    </p>
    <p align=center style="float:left; width: 20%;">
        For inquiries, please email me at: <a href="mailto:lounes.adjou@gmail.com">email</a>
    </p>
</footer>

 ***********************************************
