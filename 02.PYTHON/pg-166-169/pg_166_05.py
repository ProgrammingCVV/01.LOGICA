print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH ARE EVEN");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write a two-digit integer: "));

if(num < 0 ):
    num *= -1;

if(num >= 10 and num <= 99):
    dig2 = num % 10;
    dig1 = num // 10;

    if(dig1 % 2 == 0 and dig2 % 2 == 0):
        print("Both digits are even.");
    else:
        print("Both digits are not even.");
else:
    print("Wrong input! Please write a two-digit integer.");