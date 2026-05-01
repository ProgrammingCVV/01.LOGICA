print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ A TWO-DIGITS INTEGER AND DETERMINE IF ITS DIGITS ARE PRIMES");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write a two-digits integer: "))
prime1 = True;
prime2 = True;
dig1 = 0;
dig2 = 0;

if(num < 0):
    num *= -1;

if(num >= 10 and num <= 99):
    dig2 = num % 10;
    dig1 = num // 10;
    print(dig1, "  ", dig2);
    
    i = 2;
    j = 2;
    for i in range(i, dig1):
        if(dig1 % i == 0):
            prime1 = False;
            break;

    for j in range(j, dig2):
        if(dig2 % j == 0):
            prime2 = False;
            break;
    
    if(prime1):
        print("The first digit is prime ");
    else:
        print("The first digit isn't prime ");
        

    if(prime2):
        print("and the second digit is prime. ");
    else:
        print("and the the second digit isn't prime. ");

else:
    print("The written number doesn't have two digits. Please try again!");