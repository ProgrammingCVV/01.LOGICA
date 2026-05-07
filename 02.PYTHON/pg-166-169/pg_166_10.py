print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH DIGITS ARE THE SAME");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write a two-digit integer: "));

if(num < 0):
    num *= -1;

if(num >= 10 and num <= 99):
    dig2 = num % 10;
    dig1 = num // 10;

    if(dig1 == dig2):
        print("Both digits are the same.");
    else:
        print("Both digits aren't same.");
else:
    print("The written number doesn't have two digits. Please try again!");