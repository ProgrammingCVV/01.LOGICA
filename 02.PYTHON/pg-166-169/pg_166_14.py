print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ TWO TWO-DIGIT INTEGERS AND DETERMINE THE SUM OF ALL THE DIGITS");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num1 = int(input("Write the first integer: "));
num2 = int(input("Write the second integer: "));

if(num1 < 0):
    num1 *= -1;

if (num2 < 0):
    num2 *= -1;

if(num1 >= 10 and num1 < 99):
    dig2 = num1 % 10;
    dig1 = num1 // 10;
else:
    print("The written number doest'n have two digits. Please try again!");

if(num2 >= 10 and num2 < 99):
    dig4 = num2 % 10;
    dig3 = num2 // 10;
else:
    print("The written number doest'n have two digits. Please try again!");

print("The sum of all the digits is ", (dig1 + dig2 + dig3 + dig4));

