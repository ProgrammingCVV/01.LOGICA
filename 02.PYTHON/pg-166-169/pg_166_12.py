print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THEY BOTH HAVE DIGITS IN COMMON");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

dig1 = 0;
dig2 = 0;
dig3 = 0;
dig4 = 0;
num1 = int(input("Write the first digit: "));
num2 = int(input("Write the second digit: "));

if(num1 < 0):
    num1 *= -1;

if(num2 < 0):
    num2 *= -1;

if(num1 >= 10 and num1 <= 99 and num2 >= 10 and num2 <= 99):
    dig2 = num1 % 10;
    dig1 = num1 // 10;
    dig4 = num2 % 10;
    dig3 = num2 // 10;

    if(dig1 == dig3 or dig1 == dig4 or dig2 == dig3 or dig2 == dig4):
        print("There are digits in common between both writen numbers.");
    else:
        print("There are not digits in common between both writen numbers.");

else:
    print("Some of the writen numbers doesn't have two digits. Please try again!");