print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ A TWO-DIGIT INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write an integer with two digits: "));
digit = 0;
sum = 0;

if(num < 0):
    num *= (-1);

if(num >= 10 and num <=99):
    digit = num % 10;
    num //= 10;
    sum = num + digit;
    print("The sum of the two digits is ", sum);

else:
    print("The written number doesn't have two digits. Please try again!");