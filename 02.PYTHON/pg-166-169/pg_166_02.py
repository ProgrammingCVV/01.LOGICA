print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ AN INTEGER AND DETERMINE IF IT HAS 3 DIGITS");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");


num = int(input("Write a number:  "));

if(num < 0):
    num *= -1;

if(num >=100 and num <= 999):
    print("The written number has 3 digits.");
else:
    print("The written number doesn't have 3 digits.");


"""
lastDigit = 0;
count = 0;

while(num > 0):
    lastDigit = num % 10;
    num //= 10;
    count += 1;

if(count == 3):
    print("The written number has", count, " digits.");
else:
    print("Three written number doesn't have three digits.")
"""

