# bankSystem
This is a simple banking system in Java, applying OOP principles. The project tests my skills in creating classes, instantiating objects, and using an ArrayList to manage accounts. I iterate over the accounts to print the owner, balance, and provide a withdraw method via an interface for the two child classes.

## How to Use
1. Set up your project folders (e.g., `folderprojectname > src > files from this repo`).  
2. Compile and run `Application.java`.

## Why I made this project
At university, I had never worked with classes and objects before—it was like a black curtain for me. So I built a simple Brazilian-style Bank System using only my notes and what I learned that week. It was a great way to practice and test my skills.

## Files in this repo
- **ContaBancaria.java** – Superclass for the bank accounts.  
- **ContaPoupanca.java** – Savings account that generates interest.  
- **ContaCorrente.java** – Checking account with a special credit limit.  
- **Saca.java** – Interface for the `withdraw` method, implemented differently in each account type.  
- **Application.java** – Main class that runs the program using `ArrayList<>` and `Iterator<>`. Learn more about this syntax [here](https://www.w3schools.com/java/ref_arraylist_iterator.asp).
