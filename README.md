# WhiteSpace

What is _whitespace_ in coding? What is whitespace in a text file?
Well, we are told that _whitespace_ doesn't matter in Java.

Yes. a _space_ character is _whitespace_ (like in this string, between the double quotes, `" "` there is One space)

And __YO__, when you see a string `"A string"`, the _double quotes_ define, _delimit_, the string. They __are not part of the string.__
You'll see the word _delimiter_ to describe the beginning and the end of strings.
_Delimiter_ means the `"` or `'` around the string (yes, in some langues you can use a single quote or double quote).
More on what you do if you need to put a double quote _INSIDE_ a string later.

There are a few test data files in the top level of this repo.
Write a method in class `Whitespace` called `countBoth(String input)` that prints out the number of whitespace 
characters found, and the number of non-whitespace characters found. Your output should match the answers below.

You are __not_ allowed to use the `Character.isWhitespace()` method in your solution. 
(But you should read about it, so you know what you're trying to write.)

If the input string is `"This is a string."` your `countBoth` should print

```
3, 14
```
Notice the comma! And Notice how the double quotes are ingmored by the counting method.

If the data file contains 

```
Zip Code Wilmington
creates
Great Coders.
```

Output should be....

```
5, 34
```

(Yes, really)

when you read in the testdata files, your program should print

```
5, 36
52, 276
234, 1089
```

as output. first line is testdata1, then 2, then 3.

## On Whitespace

_When I asked Github CoPilot to describe _whitespace_ with respect to Java, it helpfully wrote:_

In Java, whitespace refers to one or more non-printable characters such as:

- ' ' (space)
- '\t' (tab)
- '\n' (new line)
- '\r' (carriage return)

These characters are used to format the code for better readability. They separate tokens in the Java source code, but the Java compiler generally ignores them. For example, the following two lines of code are equivalent:

```java
int x = 10;
```

```java
int     x    =    10;
```

In both cases, the Java compiler ignores the extra whitespace and treats both lines as identical.

## Postscript

_ONE of the key learnings here is understanding those extra characters, __newline__ and __carriage return__, and how they are interpreted._

Yep, this zipcode stuff is gonna be _fun!_
  
