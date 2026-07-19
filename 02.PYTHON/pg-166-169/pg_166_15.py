print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A THREE-DIGITS INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write a three-digit integer: "));

if(num < 0):
    num *= -1;

if(num > 100 and num < 999):
    dig3 = num % 10;
    dig2 = num // 10 % 10;
    dig1 = num // 100 % 10;

    sum = dig1 + dig2 + dig3;

    print("The sum of all digits is: ", sum);
else:
    print("The written number doesn't have three digits. Please try again!");