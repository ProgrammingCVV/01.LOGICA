print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ A THREE-DIGITS INTEGER AND DETERMINE THE POSITION OF THE DIGIT WITH THE HIGHEST VALUE");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write a three-digits integer: "));

if(num < 0):
    num *= -1;

if(num > 100 and num < 999):
    dig3 = num % 10;
    dig2 = (num / 10) % 10;
    dig1 = (num / 100) % 10;

    if(dig1 > dig2 and dig1 > dig3):
        print("The first digit is higher than the others.");
    elif(dig2 > dig1 and dig2 > dig3):
        print("The second digit is higher than the others.");
    elif(dig3 > dig1 and dig3 > dig2):
        print("The third digit is higher than the others.");
    elif(dig1 == dig2 or dig2 == dig3):
        print("All digits o two digits are the same.");
    
else:
    print("The written number doesn't have three digits. Please try again!");