print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A TWO-DIGITS INTEGER AND DETERMINE IF IT'S A PRIME AND NEGATIVE NUMBER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write a two-digits integer: "))
i = 2;
prime = True;

if(num < 0):
    
        print("The written number is negative ");
        num *= -1;

else:
        print("The written number is positive ");

if(num >= 10 and num <= 99):
        
        while(i < num):
                if(num % i == 0):
                        prime = False;
                        break;
                i += 1;
        if(prime):
                print("and is prime.")
        else:
                print("and isn't prime.")
else:
        print("but doesn't have two digits. Please try again!")