print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A THREE-DIGITS INTEGER AND DETERMIN IF SOME DIGIT IS MULTIPLE OF OTHER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write a three-digits integer: "));

if(num < 0):
    num *= -1;

if(num > 100 and num < 999):
    dig3 = num % 10;
    dig2 = (num // 10) % 10;
    dig1 = (num // 100) % 10;

    print(dig1, "-", dig2, "-", dig3);

    if(dig1 % dig2 == 0 or dig1 % dig3 == 0):
        print("The first digit is multiple of the others.");
    elif(dig2 % dig1 == 0 or dig2 % dig3 == 0):
            print("The second digit is multiple of the others.");
    elif(dig3 % dig1 == 0 or dig3 % dig2 == 0):
            print("The third digit is multiple of the others.");
    else:
        print("None of the digits us multiple of other.");

else:
    print("The written number doesn't have three digits. Please try again!");