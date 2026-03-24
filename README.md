# Student registration checker

## What it does

1. Asks for the student’s name.
2. Asks how many units they are registering for.
3. If units are **greater than 7** → prints **Overload - Approval Required**.
4. If units are **7 or less** → prints **Registration Accepted**.
5. Prints a short **summary** with name, units, and status.

The same steps are implemented in four folders: `python`, `java`, `javascript`, and `c`.

## What you need

- **Python:** Python 3  
- **Java:** JDK (`javac` and `java`)  
- **JavaScript:** [Node.js](https://nodejs.org/) (`node`)  
- **C:** A C compiler (for example GCC)

## How to run

Open a terminal. Go to the project folder, then into the language folder. Run the commands below.

### Python

```bash
cd python
python registration_checker.py
```

### Java

```bash
cd java
javac RegistrationChecker.java
java RegistrationChecker
```

*(The `.java` filename must match the `public class` name: `RegistrationChecker`.)*

### JavaScript

```bash
cd javascript
node registration_checker.js
```

### C

```bash
cd c
gcc -o registration_checker registration_checker.c
```

**Windows:** run `registration_checker.exe`

**Mac / Linux:** run `./registration_checker`

## More notes

See `comparison.md` for a short comparison of the four languages.
