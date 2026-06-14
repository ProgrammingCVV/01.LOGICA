print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ THREE-DIGITS INTEGER AND DISPLAY ALL THE NUMBERS COMPRENDED BETWEEN 1 AND EACH ONE OF THE DIGITS");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write an integer with three digits: "))
dig1 = 0;
dig2 = 0;
dig3 = 0;
i = 1;
j =1;
k = 1;


if(num < 0):
    num += -1;

if(num >= 100 and num <= 999):

    dig1 = (num // 100) % 10;
    dig2 = (num // 10) % 10;
    dig3 = num -(num // 10 * 10);

    print(dig1, "", dig2, "", dig3);

    while(i < dig1+1):
        print(i, end="");
        i += 1;
    
    print("");

    while(j < dig2+1):
        print(j, end="");
        j += 1;

    print("");

    while(k < dig3+1):
        print(k, end="");
        k += 1;

else:
    print("The written number doesn't have three digits. Please try again!");