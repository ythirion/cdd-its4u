# Crappy Driven-Development (CDD)
Let's learn a new development practice : Crappy-Driven Development.
`The secret art of making yourself indispensable by writing crappy code !!!`

## Kata
In small groups / [mob](https://www.youtube.com/watch?v=SHOVVnRB4h0&ab_channel=GOTOConferences) :
* Choose a code in a language you want to work with (`C#`, `java`, `scala`)
* Your objective : Apply CDD to make the code so crappy that other groups won't be able to understand it
  * Follow the golden rules described below
![Crappy-Driven-Development](img/crappy-driven-development.png)
  * Make it in Baby steps (crappy 1 thing at a time)
* You have 30 minutes to make as many cycles as possible :
  * Make it in mob
  * Be creative
  * The more brainfuck it is the better
  * Tests are green before and at the end of your refactoring

### Mob roles
I recommend to use [mobtime](https://mobti.me/) and configure below roles :
* Turn Duration : 5 minutes
* Create the 4 roles presented below

![mob config](img/mob-config.png)

#### Driver
![driver](img/driver.png)

* Write the code according to the navigator's specification
* Listen intently to the navigators instructions
* Ask questions wherever there is a lack of clarity

#### Navigator
![navigator](img/navigator.png)

* Dictates the code that is to be written - the 'what'
* Clearly communicates what code to write
* Explains 'why' they have chosen the particular solution to this problem
* Check for syntax / type errors as the Driver drives

#### Scribe
![scribe](img/scribe.png)

* Write down the goals of each cycle in mobtime
* Explain why it has been decided

![goals examples](img/example.png)

#### Crappier
![crappier](img/crappier.png)

* Anticipate what can be crappier
* Write down ideas that emerge in his/he mind and other ideas as well

### Review
At the end of the 60 minutes period : 
* Each mob presents the new version of the production code
* Other groups have 2 minutes to identify what is implemented

## Test && Commit || Revert (TCR)
### (SUPER) Important

Create a branch of your own so you don't push all your commits on the main branch!

### Tool
Without going too much in detail, here's a little explanation on how the TCR Utility Tool works.

The command must follow the following format, and be executed from the root directory:
- .\tcr\\**OS**\tcr.exe -b .\\**language**\ -w .\\**language**\ -l **language**

```shell
./tcr/MacOs/tcr -b java/ -w java/ -t maven
.\tcr\Windows\tcr.exe -b .\java\ -w .\java\ -l java -t maven
```

From there, the tool will provide a set of options:
```shell
[TCR] Available Options:
[TCR]   D -> Driver role
[TCR]   N -> Navigator role
[TCR]   P -> Turn on/off git auto-push
[TCR]   Q -> Quit
[TCR]   ? -> List available options
```

It's pretty simple:
- When it's your turn to drive, pick the **Driver role** or press **D**. You will be the driver for the next 5 minutes.
- Otherwise, pick the **Navigator role** or press **N**. You will constantly pull commits and have an up-to-date codebase.

Please, make sure to follow your rotation and have only one driver at a time.

### Reflect
Take a few minutes to reflect and ask questions :
* Based on your mob refactoring list, which patterns did you observe recently in your codebase ?
* What did you learn from this kata ?
* How this practice can be applied in your current context ? 😜

## Why this kata ?
* By having a reversed reflexion (How can I make my code the crappiest possible), people think outside of the box
* The list of implemented crappy refactoring serve as an anti-patterns list :
  * All the code smells they must avoid in their own code
  * Stuff to fight against
* Learn Mob Programming
* Practice automated refactoring : rename, move, extract, ...
* Because it's fun 😊

