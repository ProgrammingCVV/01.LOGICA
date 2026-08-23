print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A THREE-DIGITS INTEGER AND DETERMINE IF AT LEAST TWO OF THREE DIGITS ARE THE SAME");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

dig1 = 0;
dig2 = 0;
dig3 = 0;
num = int(input("Write a three-digits integer: "));

if(num < 0):
    num *= -1;

if(num > 100 and num < 999):
    dig3 = num % 10;
    dig2 = (num // 10) % 10;
    dig1 = (num // 100) % 10;

else:
    print("The written number doesn't have three digits. Please try again!");

if(dig1 == dig2):
    print("The first and second digit are the same.");
elif(dig1 == dig3):
    print("The first and third digit are the same.");
elif(dig2 == dig3):
    print("The second and third digit are the same.");

else:
    print("None of the digits are the same.");