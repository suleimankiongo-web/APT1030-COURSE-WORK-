# How the four versions felt to me (beginner-ish take)

I’m not an expert in all of these — I just rebuilt the same tiny program in each language so I could compare them. So this is more “what stuck with me” than a technical white paper.

## Python

Python was the quickest to get working. `input()` gives you a string, `int(...)` turns the units into a number, and the `if` / `else` part is exactly what you’d write on paper. I used simple `print` with commas instead of fancy formatting because I’m still more comfortable reading it that way. The hardest part was remembering that invalid input (like typing letters for the units) will crash unless you add extra checks — I didn’t add those on purpose to keep the script short.

## Java

Java felt a bit more “official”: you need a `main`, you import `Scanner`, and you have to say `String` vs `int` out loud. Once that’s set up, though, it’s the same story — read a line, read an integer, compare to 7. I’m still getting used to typing `System.out.print` over and over. Also worth knowing: the file name has to match the public class name, or the compiler complains and you’re stuck googling why.

## JavaScript (Node)

I used Node in the terminal, not a browser, so there’s no `prompt()` like in some tutorials. Instead you use `readline`, and the questions happen inside **callbacks** — one function runs after the other finishes. It works fine; it just looks a bit nested until you’ve seen the pattern a few times. `parseInt` is how I turned the typed units into a number. If someone types something weird, you can get `NaN` and the summary will look odd; again, I kept it simple on purpose.

## C

C was the one where I actually had to think about **what happens when you press Enter**. `fgets` reads the name but leaves a newline on the string, so I added a small block to chop that off — otherwise your output looks messy. For the units I used `scanf` with `%d`. Class notes often say mixing `fgets` and `scanf` can be annoying; for this short program it was okay after me trimming the name string. You also have to **compile** before you run, which is easy to forget if you’re coming from Python.

## Bottom line

Same problem everywhere: **more than 7 units → overload message**, otherwise **accepted**, then **print a summary**. The differences are mostly *how* you read input and *how much* the language does for you behind the scenes — not the actual logic, which is pretty small.
