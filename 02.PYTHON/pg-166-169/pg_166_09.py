print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ A TWO-DIGIT INTEGER AND DETERMINE IF ONE OF ITS DIGITS IS A MULTIPLE OF THE OTHER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write a two-digit integer: "));

if(num < 0):
    num *= -1;

if(num >= 10 and num <= 99):
    dig2 = num % 10;
    dig1 = num // 10;

    if(dig1 % dig2 == 0):
        print("The first digit is multiple of the second digit.");
    else:
        print("The first digit isn't multiple of the second digit.");

    if(dig2 % dig1 == 0):
        print("The second digit is multiple of the first digit.");
    else:
        print("The second digit isn't multiple of the first digit.");

else:
    print("The writen number doesn't have two digits. Please try again!");